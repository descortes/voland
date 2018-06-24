package juego.walk.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Stage extends JPanel {

    private Person walker;

    public Stage(int width,int height){
        JFrame frame = new JFrame("Nivel 1");
        frame.add(this);
        frame.setSize(width,height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setFocusable(true);
    }

    public void addPerson(){
        this.walker = new Person(this);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                walker.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                walker.keyReleased(e);
            }
        });
    }

    public void move(){
        this.walker.move();
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        this.walker.paint(g2d);

    }

}
