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
public class chimera extends Character {

    private int LongAttack;

 

    public chimera() {

    }

    public chimera(int LongAttack, int defense, int shortAttack, double delay, int range) {
        super(defense, shortAttack, delay, range);
        this.LongAttack = LongAttack;

    }

    public int getLongAttack() {
        return LongAttack;
    }

    public void setLongAttack(int LongAttack) {
        this.LongAttack = LongAttack;
    }

    @Override
    public String toString() {
        return "chimera{" + "LongAttack=" + LongAttack + super.toString();
    }

}
