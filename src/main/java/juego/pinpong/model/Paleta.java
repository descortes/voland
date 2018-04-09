package juego.pinpong.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Paleta extends JPanel {
    private int x  = 0;
    private int xa = 0;
    private MesaDePinPong mesaDePinPong;

    private static final int y = 330;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 10;

    public Paleta(MesaDePinPong mesaDePinPong){
        this.mesaDePinPong = mesaDePinPong;
        //this.possX = possX;
        //this.possY = possY;
    }

    public void move() {
        if (x + xa > 0 && x + xa < mesaDePinPong.getWidth() - WIDTH)
            x = x + xa;
    }

    public void paint(Graphics2D graphics){
        graphics.setColor(Color.ORANGE);
        graphics.fillRect(x,y, WIDTH,HEIGHT);
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

    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.WIDTH, this.HEIGHT);
    }

    public int getTopY() {
        return this.y;
    }

}
