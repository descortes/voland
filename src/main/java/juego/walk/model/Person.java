package juego.walk.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Person extends JPanel {

    private int possX       = 0;
    private int possX_sense = 0;
    private int possY       = 0;
    private int possY_sense = 0;
    private Stage level;



    public Person(Stage level){
        this.level = level;
    }


    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            possX_sense = -2;

        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            possX_sense = 2;

        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            possY_sense = 2;

        if(e.getKeyCode() == KeyEvent.VK_UP)
            possY_sense = -2;

    }


    public void move(){
        this.possX = this.possX + this.possX_sense;
        this.possY = this.possY + this.possY_sense;
    }

    public void keyReleased(KeyEvent e) {
        this.possX_sense = 0;
        this.possY_sense = 0;
    }

    public void paint(Graphics2D g2d){
        g2d.setColor(Color.BLACK);
        g2d.fillOval(possX,possY,30,30);
    }

    public Rectangle getBounds(){
        return new Rectangle(possX,possY,10,10);
    }
}
