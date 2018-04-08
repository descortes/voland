package juego.pinpong.model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CustomKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("Key Typed "+e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {

        //if (e.getKeyCode() == KeyEvent.VK_A){
        //    System.out.println("Key Pressed A");
        //}

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("Key Released " + e.getKeyCode());
    }
}
