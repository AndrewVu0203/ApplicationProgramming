package Chess.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class BPawnPromo implements Initializable {

    String whichPiece;
    Stage secondStage;

    public Stage getSecondStage() {
        return secondStage;
    }

    public void setSecondStage(Stage secondStage) {
        this.secondStage = secondStage;
    }

    public String getWhichPiece() {
        return whichPiece;
    }

    public void setWhichPiece(String whichPiece) {
        this.whichPiece = whichPiece;
    }


    @FXML
    public void rookClick(){
        setWhichPiece("rook");
        getSecondStage().close();
    }

    @FXML
    public void knightClick(){
        setWhichPiece("knight");
        getSecondStage().close();
    }

    @FXML
    public void bishopClick(){
        setWhichPiece("bishop");
        getSecondStage().close();
    }

    @FXML
    public void queenClick(){
        setWhichPiece("queen");
        getSecondStage().close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {  }
}