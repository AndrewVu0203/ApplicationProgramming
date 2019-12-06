package Chess.controller;

import Chess.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    /**
     * one player button in Menu.fxml
     * @param e event
     */
    public void onePlayer(ActionEvent e) throws IOException {
        Stage secondStage = new Stage();
        Parent root2;
        root2 = FXMLLoader.load(getClass().getResource("/Chess/view/ComingSoon.fxml"));
        Scene scene = new Scene(root2, 400, 200);
        secondStage.setScene(scene);
        secondStage.setTitle("Coming Soon!");
        secondStage.show();
    }

    /**
     * two player button in Menu.fxml
     * e event
     */
    public void twoPlayer(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Chess/view/Chess.fxml"));
        Parent root = loader.load();
        Main.stage.setScene(new Scene(root));
        Main.stage.show();

        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        Main.stage.setX((primScreenBounds.getWidth() - Main.stage.getWidth()) / 2);
        Main.stage.setY((primScreenBounds.getHeight() - Main.stage.getHeight()) / 2);
    }

    /**
     * about button in Menu.fxml
     * @param e event
     */
    public void aboutButton(ActionEvent e) {
        if(Desktop.isDesktopSupported())
        {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/TheGreatAndrew/ApplicationProgramming"));
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            }
        }
    }
    /**
     * rule button in Menu.fxml
     * @param e event
     */
    public void rulesButton(ActionEvent e) {
        if(Desktop.isDesktopSupported())
        {
            try {
                Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/Rules_of_chess"));
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            }
        }
    }
    /**
     * quit in Menu.fxml
     */
    public void quit(ActionEvent e) {
        System.exit(1);
    }

    /**
     * @param location url location
     * @param resources resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
