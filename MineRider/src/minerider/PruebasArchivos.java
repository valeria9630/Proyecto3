/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

import org.json.simple.parser.ParseException;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class PruebasArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        FileManagerJson fileManagerJson = new FileManagerJson();
        fileManagerJson.FileReader();
    }

}
