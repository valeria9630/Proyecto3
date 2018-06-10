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

    public ConstructorJuego FileReader() {
        Gson gson = new Gson();
        ConstructorJuego constructorJuego = null;

        try (Reader reader = new FileReader(pathFile)) {

            // Convert JSON to Java Object
            constructorJuego = gson.fromJson(reader, ConstructorJuego.class);
            System.out.println(constructorJuego);

            // Convert JSON to JsonElement, and later to String
            /*JsonElement json = gson.fromJson(reader, JsonElement.class);
            String jsonInString = gson.toJson(json);
            System.out.println(jsonInString);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        return constructorJuego;
    }

    public void deleteJson(String pathDelete) {

        File fileDelete = new File(pathDelete);

        fileDelete.delete();

    }

}
