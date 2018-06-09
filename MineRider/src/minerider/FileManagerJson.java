/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class FileManagerJson {

    private static String pathFile;

    public FileManagerJson() {
        this.pathFile = "src\\minerider\\normal.json";
    }

    public Juego FileReader() {
        Gson gson = new Gson();
        Juego juego = null;

        try (Reader reader = new FileReader("src\\minerider\\normal.json")) {

            // Convert JSON to Java Object
            juego = gson.fromJson(reader, Juego.class);
            System.out.println(juego);

            // Convert JSON to JsonElement, and later to String
            /*JsonElement json = gson.fromJson(reader, JsonElement.class);
            String jsonInString = gson.toJson(json);
            System.out.println(jsonInString);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        return juego;
    }

    public void deleteJson(String pathDelete) {

        File fileDelete = new File(pathDelete);

        fileDelete.delete();

    }

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

    public class player extends Personaje {

        private int visionRange;
        private int LongAttack;

        public player() {
        }

        public player(int defense, int shortAttack, double delay, int range) {
            super(defense, shortAttack, delay, range);
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

    public class chimera extends Personaje {

        private int LongAttack;

        public chimera() {
        }

        public chimera(int defense, int shortAttack, double delay, int range) {
            super(defense, shortAttack, delay, range);
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

    public class zombie extends Personaje {

        public zombie() {
        }

        public zombie(int defense, int shortAtatack, double delay, int range) {
            super(defense, shortAtatack, delay, range);
        }

    }

    public class Juego {

        private String saveFile;
        private int width;
        private int height;
        private String type;
        private Probalities probabilities;
        private player player;
        private chimera chimera;
        private zombie zombie;

        public Juego() {
        }

        public Juego(String saveFile, int width, int heigth, String type, Probalities probabilities, player player, chimera chimera, zombie zombie) {
            this.saveFile = saveFile;
            this.width = width;
            this.height = height;
            this.type = type;
            this.probabilities = probabilities;
            this.player = player;
            this.chimera = chimera;
            this.zombie = zombie;
        }

        public String getSaveFile() {
            return saveFile;
        }

        public void setSaveFile(String saveFile) {
            this.saveFile = saveFile;
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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Probalities getProbabilities() {
            return probabilities;
        }

        public void setProbabilities(Probalities probabilities) {
            this.probabilities = probabilities;
        }

        public player getPlayer() {
            return player;
        }

        public void setPlayer(player player) {
            this.player = player;
        }

        public chimera getChimera() {
            return chimera;
        }

        public void setChimera(chimera chimera) {
            this.chimera = chimera;
        }

        public zombie getZombie() {
            return zombie;
        }

        public void setZombie(zombie zombie) {
            this.zombie = zombie;
        }

        @Override
        public String toString() {
            return "Juego{" + "saveFile=" + saveFile + ", width=" + width + ", height=" + height + ", type=" + type + ", probabilities=" + probabilities + ", player=" + player + ", chimera=" + chimera + ", zombie=" + zombie + '}';
        }

    }
}
