package juego.pinpong.model;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MesaDePinPong extends JPanel {

    private Pelota pelota;
    private Paleta paleta;


    public MesaDePinPong(int ancho, int alto) {
        JFrame frame = new JFrame("Mesa de PingPong");
        frame.add(this);
        frame.setSize(ancho,alto);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
    }

    public void addPelota() {
        this.pelota = new Pelota(this);
    }

    public void addPaleta() {
        this.paleta = new Paleta(this);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                paleta.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                paleta.keyReleased(e);
            }
        });
    }

    public void gameOver(){
        JOptionPane.showMessageDialog(this,"Game Over","Game Over",JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        this.pelota.paint(g2d);
        this.paleta.paint(g2d);
    }

    public void move() {
        this.paleta.move();
        this.pelota.move();
    }

    public Paleta getPaleta() {
        return this.paleta;
    }
}
