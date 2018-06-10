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
public abstract class Personaje {

    private int defense;
    private int shortAttack;
    private double delay;
    private int range;

    public Personaje() {
    }

    public Personaje(int defense, int shortAttack, double delay, int range) {
        this.defense = defense;
        this.shortAttack = shortAttack;
        this.delay = delay;
        this.range = range;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getShortAttack() {
        return shortAttack;
    }

    public void setShortAttack(int shortAttack) {
        this.shortAttack = shortAttack;
    }

    public double getDelay() {
        return delay;
    }

    public void setDelay(double delay) {
        this.delay = delay;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "personaje{" + "defense=" + defense + ", shortAttack=" + shortAttack + ", delay=" + delay + ", range=" + range + '}';
    }

}
