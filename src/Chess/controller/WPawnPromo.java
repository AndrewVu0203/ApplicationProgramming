package Chess.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class WPawnPromo implements Initializable {
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

    /**
     * pick a rook
     */
    @FXML
    public void rookClick(){
        setWhichPiece("rook");
        getSecondStage().close();
    }
    /**
     * pick a knight
     */
    @FXML
    public void knightClick(){
        setWhichPiece("knight");
        getSecondStage().close();
    }
    /**
     * pick a bishop
     */
    @FXML
    public void bishopClick(){
        setWhichPiece("bishop");
        getSecondStage().close();
    }
    /**
     * pick a queen
     */
    @FXML
    public void queenClick(){
        setWhichPiece("queen");
        getSecondStage().close();
    }
    /**
     * init
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {  }
}