package Chess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage stage;
    public Parent root;

    /**
     * run the application
     * @param primaryStage stage of the application to run scene
     */
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
