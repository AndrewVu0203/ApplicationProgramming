package Chess;

import Chess.model.Board;
import Chess.model.Piece;
import Chess.model.Team;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/Chess.fxml"));
        primaryStage.setTitle("Chess");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        // An example of how to use it
        Board chess = new Board();
        Team white = chess.getWhiteTeam();
        Piece[][] pieces = white.getPieces();
        primaryStage.setTitle(pieces[0][0].getName());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
