package Chess.controller;

import Chess.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class WPawnPromo implements Initializable {
    String whichPiece;

    public String getWhichPiece() {
        return whichPiece;
    }

    public void setWhichPiece(String whichPiece) {
        this.whichPiece = whichPiece;
    }

    public void onePlayer(ActionEvent e) throws IOException {
    }

    public void twoPlayer(ActionEvent e) throws IOException {
    }

    @FXML
    public void rookClick(){
        setWhichPiece("rook");
    }

    @FXML
    public void knightClick(){
        setWhichPiece("knight");
    }

    @FXML
    public void bishopClick(){
        setWhichPiece("bishop");
    }

    @FXML
    public void queenClick(){
        setWhichPiece("queen");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {  }
}