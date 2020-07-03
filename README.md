# JavaWrappers
Wrappers for various multimedia libraries in Java

# ABOUT:

This is a collection of wrappers written in Java for various multimedia libraries, such as SDL, Sigil, etc. Note these wrappers use the JNI way to wrap the various libraries. You will also need the 64-bit version of the DLLs in order to use these wrappers. 

# WRAPPERS:
* Sigil


# SIGIL EXAMPLE:
```Java
public class JavaSigil {
 public static void main(String[] args) {
        // TODO code application logic here
        NativeLibrary.addSearchPath("sigil", "Path to 64-bit Sigil DLL");
        
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
```

LICENSE:

This software is provided as-is. There is no warranty for this software. You use this software
at your own risk. You may not hold the developers of the wrapper. You may distribute creations developed
with this wrapper as you please, royalty free. This software is provided in the event that it is
helpful.
