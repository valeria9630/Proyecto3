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
public class Probalities {

    private int stone;
    private int zombie;
    private int chimera;

    public Probalities() {
    }

    public Probalities(int stone, int zombie, int chimera) {
        this.stone = stone;
        this.zombie = zombie;
        this.chimera = chimera;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getZombie() {
        return zombie;
    }

    public void setZombie(int zombie) {
        this.zombie = zombie;
    }

    public int getChimera() {
        return chimera;
    }

    public void setChimera(int chimera) {
        this.chimera = chimera;
    }

    @Override
    public String toString() {
        return "Probalities{" + "stone=" + stone + ", zombie=" + zombie + ", chimera=" + chimera + '}';
    }

}
