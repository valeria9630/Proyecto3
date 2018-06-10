/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class player extends Personaje {

    private int visionRange;
    private int LongAttack;
    private String direccion;
    private String salto;
    private char espada;
    private char látigo;
    private char pala;
    //agregar posicion

    public player() {
    }

    public player(int defense, int shortAttack, double delay, int range) {
        super(defense, shortAttack, delay, range);
        this.pala = pala;
        this.espada = espada;
        this.látigo = látigo;
        this.salto = salto;
        this.direccion = direccion;
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
