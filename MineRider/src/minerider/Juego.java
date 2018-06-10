/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

import java.util.ArrayList;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Juego {

    private static ArrayList<zombie> zombies;
    private static ArrayList<chimera> chimeras;
    private static player player;

    public Juego() {
    }

    public static ArrayList<zombie> getZombies() {
        return zombies;
    }

    public static void setZombies(ArrayList<zombie> zombies) {
        Juego.zombies = zombies;
    }

    public static ArrayList<chimera> getChimeras() {
        return chimeras;
    }

    public static void setChimeras(ArrayList<chimera> chimeras) {
        Juego.chimeras = chimeras;
    }

    public static player getPlayer() {
        return player;
    }

    public static void setPlayer(player player) {
        Juego.player = player;
    }

}
