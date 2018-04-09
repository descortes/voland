package juego.pinpong.model;

import javax.swing.*;
import java.awt.*;

public class Pelota extends JPanel {

    private static final int DIAMETER = 30;
    private int x  = 0;
    private int y  = 0;
    private int xa = 1;
    private int ya = 1;
    private MesaDePinPong mesaDePinPong;

    public Pelota(MesaDePinPong mesaDePinPong){
      this.mesaDePinPong = mesaDePinPong;
    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillOval(x,y, 30,30);
    }

    void move() {
        if (x + xa < 0)
            xa = 1;
        if (x + xa > mesaDePinPong.getWidth() - DIAMETER)
            xa = -1;
        if (y + ya < 0)
            ya = 1;
        if (y + ya > mesaDePinPong.getHeight() - DIAMETER)
            mesaDePinPong.gameOver();
        if (collision()){
            ya = -1;
            y = mesaDePinPong.getPaleta().getTopY() - DIAMETER;
        }
        x = x + xa;
        y = y + ya;
    }

    private boolean collision() {
        return mesaDePinPong.getPaleta().getBounds().intersects(getBounds());
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }


    /***
     *
     * @param width
     * @param height
     *
     * La Pelota no debe pasar el limite de la mesa.
     */
    /*
    @Deprecated
    public void mover(int width, int height) {

        // La pelota rebota si esta en un limite
        if (!dentroDelLimiteDerecho(width)){
            //moverEnX = -1;
        }
        if (!dentroDelLimiteIzquierdo()){
            //moverEnX = 1;
        }

        if(!denttroDelLimiteArriba(height)){
            //moverEnY = -1;
        }
        if (!dentroDelLimiteAbajo()){
            //moverEnY = 1;
        }

        //this.possX = this.possX + moverEnX;
        //this.possY = this.possY + moverEnY;
    }

    private boolean dentroDelLimiteAbajo() {
//        return this.possY > 0;
    }

    private boolean dentroDelLimiteDerecho(int width) {
  //      return this.possX < width;
    }

    private boolean denttroDelLimiteArriba(int height) {
    //    return this.possY < height;
    }

    private boolean dentroDelLimiteIzquierdo() {
     //   return this.possX > 0;
    }
    */
}
