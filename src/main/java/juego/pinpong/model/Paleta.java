package juego.pinpong.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Paleta extends JPanel {
    private int x  = 0;
    private int xa = 0;
    private MesaDePinPong mesaDePinPong;

    public Paleta(MesaDePinPong mesaDePinPong){
        this.mesaDePinPong = mesaDePinPong;
        //this.possX = possX;
        //this.possY = possY;
    }

    public void move() {
        if (x + xa > 0 && x + xa < mesaDePinPong.getWidth() - 60)
            x = x + xa;
    }

    public void paint(Graphics2D graphics){
        graphics.setColor(Color.ORANGE);
        graphics.fillRect(x,330, 60,10);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar());
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xa = -1;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xa = 1;
    }

    public void keyReleased(KeyEvent e) {
        this.xa = 0;
    }
}
