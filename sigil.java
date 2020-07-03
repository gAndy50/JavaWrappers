/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasigil;

/**
 *
 * @author Andy
 */
import com.sun.jna.Library;

public interface sigil extends Library {
    void slWindow(int width,int height, char title,int fullScreen);
    void slShowCursor(int show);
    void slClose();
    boolean slShouldClose();
}
