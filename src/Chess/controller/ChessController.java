package Chess.controller;

import Chess.model.Block;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {
    @FXML GridPane gridPane;
    Block[][] blocks = new Block[8][8];

    public void setupBoard(){
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
        // Setup images
        startingPositions(blocks);
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

    public void movePiece(ActionEvent event){
        Node source = (Node) event.getSource();
        Integer col = GridPane.getColumnIndex(source);
        Integer row = GridPane.getColumnIndex(source);
        System.out.println("current col is " + col + " , current row is " + row);
    }

    @FXML public void initialize() {
        loadChessBoard();
    }

    public void loadChessBoard(){

    }

    public void loadWholeGame(){

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setupBoard();
    }
}
