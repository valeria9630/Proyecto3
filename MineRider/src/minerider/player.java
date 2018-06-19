/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

import javafx.scene.image.Image;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class player extends Character {

    private int visionRange;
    private int LongAttack;
    private String direccion;
    private String salto;
    private char espada;
    private char látigo;
    private char pala;
    Image image;
    //agregar posicion

    public player() {

    }

    public player(int visionRange, int LongAttack, String direccion, String salto, char espada, char látigo, char pala) {
        this.visionRange = visionRange;
        this.LongAttack = LongAttack;
        this.direccion = direccion;
        this.salto = salto;
        this.espada = espada;
        this.látigo = látigo;
        this.pala = pala;

    }

    public player(int visionRange, int LongAttack, String direccion, String salto, char espada, char látigo, char pala, int defense, int shortAttack, double delay, int range) {
        super(defense, shortAttack, delay, range);
        this.visionRange = visionRange;
        this.LongAttack = LongAttack;
        this.direccion = direccion;
        this.salto = salto;
        this.espada = espada;
        this.látigo = látigo;
        this.pala = pala;

    }

    public int getVisionRange() {
        return visionRange;
    }

    public void setVisionRange(int visionRange) {
        this.visionRange = visionRange;
    }

    public int getLongAttack() {
        return LongAttack;
    }

    public void setLongAttack(int LongAttack) {
        this.LongAttack = LongAttack;
    }

    @Override
    public String toString() {
        return "player{" + "visionRange=" + visionRange + ", LongAttack=" + LongAttack + super.toString();
    }

}
