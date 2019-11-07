package Chess;

import Chess.model.Block;
import Chess.model.Board;
import Chess.model.Piece;
import Chess.model.Team;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    // init() is good for connecting with EventHandler
    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("init()");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Robert's example

        //  Parent root = FXMLLoader.load(getClass().getResource("view/Chess.fxml"));
        //  primaryStage.setTitle("Chess game due date is 11/28");
        //  primaryStage.setScene(new Scene(root, 800, 800));

        //  Board chess = new Board();
        //  Team white = chess.getWhiteTeam();
        //  Piece[][] pieces = white.getPieces();
        //  primaryStage.setTitle(pieces[0][0].getName());

        // Andrew's example
        GridPane gridPane = new GridPane();

        Block[][] blocks = new Block[8][8];

        for(int row = 0 ; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                blocks[col][row] = new Block();
                blocks[col][row].setPrefHeight(100);
                blocks[col][row].setPrefWidth(100);

                blocks[col][row].setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        Node source = (Node) event.getSource();
                        Integer col = GridPane.getColumnIndex(source);
                        Integer row = GridPane.getColumnIndex(source);

                        System.out.println("current col is " + col + " , current row is " + row);

                    }
                });
                gridPane.add(blocks[col][row], col, row, 1, 1);
            }
        }
        startingPositions(blocks);

        primaryStage.setScene(new Scene(gridPane, 800, 800));
        primaryStage.show();
    }

    public void startingPositions(Block block[][]){
        ImageView blackKing = new ImageView(new Image("Chess/images/pieces/black_king.png"));
        block[4][0].setGraphic(blackKing);

        ImageView blackQueen = new ImageView(new Image("Chess/images/pieces/black_queen.png"));
        block[3][0].setGraphic(blackQueen);

        block[5][0].setGraphic(new ImageView(new Image("Chess/images/pieces/black_bishop.png")));
        block[2][0].setGraphic(new ImageView(new Image("Chess/images/pieces/black_bishop.png")));

        block[6][0].setGraphic(new ImageView(new Image("Chess/images/pieces/black_knight.png")));
        block[1][0].setGraphic(new ImageView(new Image("Chess/images/pieces/black_knight.png")));

        block[7][0].setGraphic(new ImageView(new Image("Chess/images/pieces/black_rook.png")));
        block[0][0].setGraphic(new ImageView(new Image("Chess/images/pieces/black_rook.png")));

        for(int i = 0 ; i < 8 ; i++){
            block[i][1].setGraphic(new ImageView(new Image("Chess/images/pieces/black_pawn.png")));
        }

        block[3][7].setGraphic(new ImageView(new Image("Chess/images/pieces/white_king.png")));

        block[4][7].setGraphic(new ImageView(new Image("Chess/images/pieces/white_queen.png")));

        block[5][7].setGraphic(new ImageView(new Image("Chess/images/pieces/white_bishop.png")));
        block[2][7].setGraphic(new ImageView(new Image("Chess/images/pieces/white_bishop.png")));

        block[6][7].setGraphic(new ImageView(new Image("Chess/images/pieces/white_knight.png")));
        block[1][7].setGraphic(new ImageView(new Image("Chess/images/pieces/white_knight.png")));

        block[7][7].setGraphic(new ImageView(new Image("Chess/images/pieces/white_rook.png")));
        block[0][7].setGraphic(new ImageView(new Image("Chess/images/pieces/white_rook.png")));
        for(int i = 0 ; i < 8 ; i++){
            block[i][6].setGraphic(new ImageView(new Image("Chess/images/pieces/white_pawn.png")));
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
