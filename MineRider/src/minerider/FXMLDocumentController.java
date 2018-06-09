/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane pane;

    @FXML
    private ScrollPane scrollPane;

    GridPane gridPane;

    private int row;
    private int column;
    FileManagerJson fileManagerJson;

    private void crear() {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Tile tile = new Tile();
                gridPane.setAlignment(Pos.TOP_LEFT);
                gridPane.setValignment(tile, VPos.TOP);
                gridPane.add(tile, i, j);

            }

            scrollPane.setContent(gridPane);
//
        }
    }

    public class Tile extends StackPane {

        public Tile() {
            Rectangle rect = new Rectangle(100, 100);

            rect.setFill(null);

            rect.setStroke(Color.BLACK);

            getChildren().addAll(rect);

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fileManagerJson = new FileManagerJson();
        row = fileManagerJson.FileReader().getWidth();
        column = fileManagerJson.FileReader().getHeight();
        gridPane = new GridPane();

        crear();

    }

}
