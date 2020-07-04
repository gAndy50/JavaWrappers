/*
 * Sigil Java
 Written by Andy P.
 Icy Viking Games
 Java wrapper for Sigil
 */
package javasigil;

import com.sun.jna.Native;
import com.sun.jna.Library;
import com.sun.jna.NativeLibrary;
/**
 *
 * @author Andy
 */

public class JavaSigil {

    public interface sigil extends Library {
        
       //sigil flags
        public final int SL_ALIGN_CENTER = 0;
        public final int SL_ALIGN_RIGHT = 1;
        public final int SL_ALIGN_LEFT = 2;
        
        public final int SL_KEY_ESCAPE = 256;
        public final int SL_KEY_ENTER = 257;
        public final int SL_KEY_TAB = 258;
        public final int SL_KEY_BACKSPACE = 259;
        public final int SL_KEY_INSERT = 260;
        public final int SL_KEY_DELETE = 261;
        public final int SL_KEY_RIGHT = 262;
        public final int SL_KEY_LEFT = 263;
        public final int SL_KEY_DOWN = 264;
        public final int SL_KEY_UP = 265;
        public final int SL_KEY_PAGE_UP = 266;
        public final int SL_KEY_PAGE_DOWN = 267;
        public final int SL_KEY_HOME = 268;
        public final int SL_KEY_END = 269;
        public final int SL_KEY_CAPS_LOCK = 280;
        public final int SL_KEY_SCROLL_LOCK = 281;
        public final int SL_KEY_NUM_LOCK = 282;
        public final int SL_KEY_PRINT_SCREEN = 283;
        public final int SL_KEY_PAUSE = 284;
        public final int SL_KEY_F1 = 290;
        public final int SL_KEY_F2 = 291;
        public final int SL_KEY_F3 = 292;
        public final int SL_KEY_F4 = 293;
        public final int SL_KEY_F5 = 294;
        public final int SL_KEY_F6 = 295;
        public final int SL_KEY_F7 = 296;
        public final int SL_KEY_F8 = 297;
        public final int SL_KEY_F9 = 298;
        public final int SL_KEY_F10 = 299;
        public final int SL_KEY_F11 = 300;
        public final int SL_KEY_F12 = 301;
        public final int SL_KEY_F13 = 302;
        public final int SL_KEY_F14 = 303;
        public final int SL_KEY_F15 = 304;
        public final int SL_KEY_F16 = 305;
        public final int SL_KEY_F17 = 306;
        public final int SL_KEY_F18 = 307;
        public final int SL_KEY_F19 = 308;
        public final int SL_KEY_F20 = 309;
        public final int SL_KEY_F21 = 310;
        public final int SL_KEY_F22 = 311;
        public final int SL_KEY_F23 = 312;
        public final int SL_KEY_F24 = 313;
        public final int SL_KEY_F25 = 314;
        public final int SL_KEY_KEYPAD_0 = 320;
        public final int SL_KEY_KEYPAD_1 = 321;
        public final int SL_KEY_KEYPAD_2 = 322;
        public final int SL_KEY_KEYPAD_3 = 323;
        public final int SL_KEY_KEYPAD_4 = 324;
        public final int SL_KEY_KEYPAD_5 = 325;
        public final int SL_KEY_KEYPAD_6 = 326;
        public final int SL_KEY_KEYPAD_7 = 327;
        public final int SL_KEY_KEYPAD_8 = 328;
        public final int SL_KEY_KEYPAD_9 = 329;
        public final int SL_KEY_KEYPAD_DECIMAL = 330;
        public final int SL_KEY_KEYPAD_DIVIDE = 331;
        public final int SL_KEY_KEYPAD_MULTIPLY = 332;
        public final int SL_KEY_KEYPAD_SUBTRACT = 333;
        public final int SL_KEY_KEYPAD_ADD = 334;
        public final int SL_KEY_KEYPAD_ENTER = 335;
        public final int SL_KEY_KEYPAD_EQUAL = 336;
        public final int SL_KEY_LEFT_SHIFT = 340;
        public final int SL_KEY_LEFT_CONTROL = 341;
        public final int SL_KEY_LEFT_ALT = 342;
        public final int SL_KEY_LEFT_SUPER = 343;
        public final int SL_KEY_RIGHT_SHIFT = 344;
        public final int SL_KEY_RIGHT_CONTROL = 345;
        public final int SL_KEY_RIGHT_ALT = 346;
        public final int SL_KEY_RIGHT_SUPER = 347;
        
        public final int SL_MOUSE_BUTTON_1 = 0;
        public final int SL_MOUSE_BUTTON_2 = 1;
        public final int SL_MOUSE_BUTTON_3 = 2;
        public final int SL_MOUSE_BUTTON_4 = 3;
        public final int SL_MOUSE_BUTTON_5 = 4;
        public final int SL_MOUSE_BUTTON_6 = 5;
        public final int SL_MOUSE_BUTTON_7 = 6;
        public final int SL_MOUSE_BUTTON_8 = 7;
        public final int SL_MOUSE_BUTTON_LEFT = SL_MOUSE_BUTTON_1;
        public final int SL_MOUSE_BUTTON_RIGHT = SL_MOUSE_BUTTON_2;
        public final int SL_MOUSE_BUTTON_MIDDLE = SL_MOUSE_BUTTON_3;
        
       //sigil init functions 
       void slWindow(int width,int height, String title,int fullScreen);
       void slShowCursor(int show);
       void slClose();
       boolean slShouldClose();
       
       //sigil input functions
       int slGetKey(int key);
       
       int slGetMouseButton(int btn);
       int slGetMouseX();
       int slGetMouseY();
       
       //sigil time functions
       double slGetDeltaTime();
       double slGetTime();
       
       //render function
       void slRender();
       
       //sigil color functions
       void slSetBackColor(double r,double g,double b);
       void slSetForeColor(double r,double g,double b,double a);
       
       void slSetAdditiveBlend(int add);
       
       //sigil transform functions
       void slPush();
       void slPop();
       
       void slTranslate(double x, double y);
       void slRotate(double deg);
       void slScale(double x, double y);
       
       //sigil load texture function
       int slLoadTexture(String file);
       
       //sigil sound functions
       int slLoadWAV(String file);
       int slSoundPlay(int s);
       int slSoundLoop(int s);
       void slSoundPause(int s);
       void slSoundStop(int s);
       void slSoundPauseAll();
       void slSoundResumeAll();
       void slSoundStopAll();
       boolean slSoundPlaying(int s);
       boolean slSoundLooping(int s);
       
       //sigil shape functions
       void slTriangleFill(double x,double y,double w,double h);
       void slTriangleOutline(double x,double y,double w,double h);
       
       void slRectangleFill(double x,double y,double w,double h);
       void slRectangleOutline(double x,double y,double w,double h);
       
       void slCircleFill(double x,double y,double rad,double num);
       void slCircleOutline(double x,double y,double rad,double num);
       
       void slSemiCircleFill(double x,double y,double rad,double num,double deg);
       void slSemiCircleOutline(double x,double y,double rad,double num,double deg);
       
       void slPoint(double x,double y);
       
       void slLine(double x,double y,double x2,double y2);
       
       void slSetSpriteTiling(double x,double y);
       void slSetSpriteScroll(double x,double y);
       void slSprite(int tex,double x,double y,double w,double h);
       
       //sigil text functions
       void slSetTextAlign(int font);
       double slGetTextWidth(String txt);
       double slGetTextHeight(String txt);
       int slLoadFont(String file);
       void slSetFont(int font,int size);
       void slSetFontSize(int size);
       void slText(double x,double y,String txt);
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        NativeLibrary.addSearchPath("sigil", "Path to Sigil 64-bit DLL");
        
        final sigil sig = (sigil)Native.loadLibrary("sigil",sigil.class);

        sig.slWindow(800, 600, "Java Sigil Example", 0);
        
        while(!sig.slShouldClose())
        { 
            
            if(sig.slGetKey(sig.SL_KEY_LEFT) == 1)
            {
                sig.slSetBackColor(255, 255, 255);
            }
            else if(sig.slGetKey(sig.SL_KEY_RIGHT) == 1)
            {
                sig.slSetBackColor(0, 0, 0);
            }
            else if(sig.slGetKey(sig.SL_KEY_UP) == 1)
            {
                sig.slSetBackColor(0, 255, 0);
            }
            else if(sig.slGetKey(sig.SL_KEY_DOWN) == 1)
            {
                sig.slSetBackColor(0, 0, 255);
            }
            
            if(sig.slGetKey(sig.SL_KEY_ESCAPE) == 1)
            {
                sig.slClose();
            }
            
            sig.slRender();
        }
        
        sig.slClose();
    }
    
}
