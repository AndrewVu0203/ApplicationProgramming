package Chess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

//    // init() is good for connecting with EventHandler, unused at the moment
//    @Override
//    public void init() throws Exception {
//        super.init();
//        System.out.println("init()");
//    }

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