package Chess.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class BPawnPromo implements Initializable {
    String whichPiece;
    Stage secondStage;

    /**
     * get second stage for the scene
     * @return secondStage current stage of
     */
    public Stage getSecondStage() {
        return secondStage;
    }
    /**
     * set second stage for the scene
     * @param secondStage
     */
    public void setSecondStage(Stage secondStage) {
        this.secondStage = secondStage;
    }
    /**
     * get which piece that is picked from the image for pawn promotion
     */
    public String getWhichPiece() {
        return whichPiece;
    }
    /**
     * when click at an image, will set whichPiece and it will be return for pawn promotion
     * @param whichPiece
     */
    public void setWhichPiece(String whichPiece) {
        this.whichPiece = whichPiece;
    }
    /**
     * click on rook image, will set whichPiece to Rook
     */
    @FXML
    public void rookClick(){
        setWhichPiece("rook");
        getSecondStage().close();
    }
    /**
     * click on knight image, will set whichPiece to Knight
     */
    @FXML
    public void knightClick(){
        setWhichPiece("knight");
        getSecondStage().close();
    }
    /**
     * click on bishop image, will set whichPiece to Bishop
     */
    @FXML
    public void bishopClick(){
        setWhichPiece("bishop");
        getSecondStage().close();
    }
    /**
     * click on queen image, will set whichPiece to Queen
     */
    @FXML
    public void queenClick(){
        setWhichPiece("queen");
        getSecondStage().close();
    }
    /**
     * init function
     * @param location url location
     * @param resources contain needed resource
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {  }
}