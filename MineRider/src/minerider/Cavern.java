/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

import java.nio.file.attribute.AclEntry;
import java.util.ArrayList;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Cavern {

    ///posibles atributos
    private int width;
    private int height;
    public static Box[][] board;
    private static ArrayList<zombie> listZombies;
    private static ArrayList<chimera> listChimeras;
    private static ArrayList<Stone> listStone;
    private static player player;

    public Cavern() {
        listZombies = new ArrayList<>();
        listChimeras = new ArrayList<>();
        listStone = new ArrayList<>();

        this.width = 60;
        this.height = 80;
        createBoard();
        startCharacters();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void setBoard(Box[][] board) {
        Cavern.board = board;
    }

    public static ArrayList<zombie> getListZombies() {
        return listZombies;
    }

    public static void setListZombies(ArrayList<zombie> listZombies) {
        Cavern.listZombies = listZombies;
    }

    public static ArrayList<chimera> getListChimeras() {
        return listChimeras;
    }

    public static void setListChimeras(ArrayList<chimera> listChimeras) {
        Cavern.listChimeras = listChimeras;
    }

    public static ArrayList<Stone> getListStone() {
        return listStone;
    }

    public static void setListStone(ArrayList<Stone> listStone) {
        Cavern.listStone = listStone;
    }

    public static player getPlayer() {
        return player;
    }

    public static void setPlayer(player player) {
        Cavern.player = player;
    }

    private void createBoard() {
        board = createBoard2();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int dice = throwDice2();
                int add = j + 1;
                int subtraction = j - 1;

                if (add < height && subtraction >= 0) {
                    String state = board[i][add].state;
                    String state2 = board[i][subtraction].state;

                    if (state.equalsIgnoreCase("STONE")) {

                        if ((state2.compareTo("ZOMBIE") != 0) && (state2.compareTo("CHIMERA") != 0)) {

                            if ((dice == 5)) {
//
                                board[i][j] = new Box("CHIMERA");
                                chimera chimera = new chimera();
                                chimera.setX(i);
                                chimera.setY(j);
                                listChimeras.add(chimera);
//                 
//
                            } else if (dice == 2) {

                                board[i][j] = new Box("ZOMBIE");

                                zombie zombie = new zombie();
                                zombie.setX(i);
                                zombie.setY(j);
                                listZombies.add(zombie);
//               
                            }

                        }

//                    
                    }
                }

            }

        }
    }

    private void startCharacters() {

//        for (int i = 0; i < listZombies.size(); i++) {
//            zombie zombie = (zombie) listZombies.get(i);
//            Thread thread = new Thread((Runnable) zombie);
//            thread.start();
//
//        }
    }

    public int throwDice() {

        int result = (int) ((Math.random() * 2 + 1));
        return result;
    }

    public int throwDice2() {

        int result = (int) ((Math.random() * 5 + 1));
        return result;
    }

    public Box[][] createBoard2() {
        Box[][] board2 = new Box[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int dice = throwDice();

                if (dice == 1) {

                    board2[i][j] = new Box("NOTHING");

//                    System.out.println("entro stone" + i + "" + j);
                } else if (dice == 2) {

                    board2[i][j] = new Box("STONE");
//                    System.out.println("entro nada" + i + "" + j);

//                } else if (j==height) {
//                    board2[i][j] = new Box("STONE");
//                }
                }
            }
        }
        return board2;
    }

    public String t() {
        String result = "";
        for (int i = 0; i < width; i++) {

            for (int j = 0; j < height; j++) {

                result = result + "---" + board[i][j].state + "---";
            }
            result = result + "\n";
        }
        return result;
    }
}
