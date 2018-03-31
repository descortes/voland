package juego.pinpong.model;

import javax.swing.*;
import java.awt.*;

public class Pelota extends JPanel {
    private int possX;
    private int possY;

    private int moverEnX = 1;
    private int moverEnY = 1;

    public Pelota(int possX, int possY){
        this.possX = possX;
        this.possY = possY;
    }

    public void paintComponent(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillOval(possX,possY, 30,30);
    }


    /***
     *
     * @param width
     * @param height
     *
     * La Pelota no debe pasar el limite de la mesa.
     */
    public void mover(int width, int height) {

        // La pelota rebota si esta en un limite
        if (!dentroDelLimiteDerecho(width)){
            moverEnX = -1;
        }
        if (!dentroDelLimiteIzquierdo()){
            moverEnX = 1;
        }

        if(!denttroDelLimiteArriba(height)){
            moverEnY = -1;
        }
        if (!dentroDelLimiteAbajo()){
            moverEnY = 1;
        }

        this.possX = this.possX + moverEnX;
        this.possY = this.possY;

    }

    private boolean dentroDelLimiteAbajo() {
        return this.possY > 0;
    }

    private boolean dentroDelLimiteDerecho(int width) {
        return this.possX < width;
    }

    private boolean denttroDelLimiteArriba(int height) {
        return this.possY < height;
    }

    private boolean dentroDelLimiteIzquierdo() {
        return this.possX > 0;
    }


}
