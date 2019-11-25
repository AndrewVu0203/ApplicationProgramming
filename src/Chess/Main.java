package Chess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /*
        MENU -> Isaac

        PIECES -> Andrew, Shu
        isMoveValid()
        isMoveValid() special : Pawn when first start can move 2 blocks. Pawn when reach the end can transform. 
                                King can switch place with Rock. can't jump over another chess piece.
                                (hints) Bishop : move diagonal, x=y, 2=2, 3=3 return true
                                (hints) Can't jump over another chess piecePiece collision(): return false
        -> https://github.com/Stevoisiak/JavaFX-Online-Chess/blob/master/MoveList.java

        PLAYER -> Josh + Isaac
        playTurn()
        player white
        player black

        GAME
        checkKills()
        isGameOver()

        SIDE MENU
        GO BACK TO MENU -> Issac
        resign() ->

        HISTORY LOG
        ABC123

        VIDEO
        (works on Sunday next week, everyone)

        PRESENTATION
        Isaac, Josh

        ADDITIONAL
        possibleMove()
        player dumb random machine
        en passant
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
