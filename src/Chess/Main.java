package Chess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /*
        TODO
        MENU
        Menu -> Isaac

        PIECES
        If the user clicks on nothing, and tries to move it
        Can't move only the black queen?
        isMoveValid()
        isMoveValid() special : Pawn when first start can move 2 blocks. Pawn when reach the end can transform. King <-> Rock

        PLAYER
        playTurn()
        player white
        player black

        GAME
        checkKills()
        isGameOver()

        ADDITIONAL
        another small menu next to ChessBoard, surrender(), countDownTime()
        possibleMove()
        player dumb random machine

     */



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Chess/view/Chess.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Chess");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}