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
public class Moustros {
    private String defensa;
    private int ataque;

    public Moustros() {
    }

    public Moustros(String defensa, int ataque) {
        this.defensa = defensa;
        this.ataque = ataque;
    }

    public String getDefensa() {
        return defensa;
    }

    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Moustros{" + "defensa=" + defensa + ", ataque=" + ataque + '}';
    }
    
    
}
