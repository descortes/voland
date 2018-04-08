package juego.pinpong;

import juego.pinpong.model.CustomKeyListener;
import juego.pinpong.model.MesaDePinPong;
import sun.swing.SwingAccessor;

import javax.swing.*;

public class JuegoPinPong {
    private MesaDePinPong mesaDePinPong;

    public void run(){
        System.out.println("Hola Mundo PinPong");
        init();
        loop();

        // free all
    }

    /***
     * Inicializo la mesa de pinpong
     */
    public void init(){
        mesaDePinPong = new MesaDePinPong(300,400);
        mesaDePinPong.addPaleta();
        mesaDePinPong.addPelota();
    }
    public void loop(){

        while (true){
            mesaDePinPong.move();
            mesaDePinPong.repaint();
            try{
                Thread.sleep(5);
            }catch (InterruptedException ie){
                System.out.println("error "+ ie.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new JuegoPinPong().run();
    }
}
