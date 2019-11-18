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
        isMoveValid()
        isMoveValid() special : Pawn when first start can move 2 blocks. Pawn when reach the end can transform. 
                                King can switch place with Rock. can't jump over another chess piece
        -> https://github.com/Stevoisiak/JavaFX-Online-Chess/blob/master/MoveList.java

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
    
    public static Stage stage;
    public Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        root = FXMLLoader.load(getClass().getResource("/Chess/view/Menu.fxml"));
        Scene scene = new Scene(root, 600, 430);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chess Menu");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
