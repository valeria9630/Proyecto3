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
public class Game {

    public static Cavern cavern;

    public Game() {
        cavern = new Cavern();
    }

    public static Cavern getCavern() {
        return cavern;
    }

    public static void setCavern(Cavern cavern) {
        Game.cavern = cavern;
    }

}
