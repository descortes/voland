package juego.pinpong.model;

import sun.swing.SwingAccessor;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MesaDePinPong extends JFrame {

    private Pelota pelota;


    public MesaDePinPong(int ancho, int alto){
        super("Mesa de pinpong");
        setSize(ancho,alto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creo una pelota
        Container elementosEnLaMesa = getContentPane();
        elementosEnLaMesa.add(new Pelota(10,10));
    }

    public void ciclo() {
        Container elementosEnLaMesa = getContentPane();
        Pelota pelota = (Pelota) elementosEnLaMesa.getComponent(0);
        pelota.mover(getWidth(),getHeight());
    }
}
