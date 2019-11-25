package Chess.controller;

import Chess.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class MenuController implements Initializable {

    public void onePlayer(ActionEvent e) throws IOException {
        Stage secondStage = new Stage();
        Parent root2;
        root2 = FXMLLoader.load(getClass().getResource("/Chess/view/ComingSoon.fxml"));
        Scene scene = new Scene(root2, 300, 200);
        secondStage.setScene(scene);
        secondStage.setTitle("Coming Soon!");
        secondStage.show();

        long mTime = System.currentTimeMillis();
        long end = mTime + 3000; // 5 seconds

        while (mTime < end)
        {
            mTime = System.currentTimeMillis();
        }
        secondStage.close();
    }

    public void twoPlayer(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Chess/view/Chess.fxml"));
        Parent root = loader.load();
        Main.stage.setScene(new Scene(root));
        Main.stage.show();
    }

    public void quit(ActionEvent e) {
        System.exit(1);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
