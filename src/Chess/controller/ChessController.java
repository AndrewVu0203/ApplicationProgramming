package Chess.controller;

import Chess.model.Block;
import Chess.model.Board;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {
    static Board chessBoard;
    @FXML GridPane gridPane;
    Block[][] blocks = new Block[8][8];

    public void setupBoard(){
        for(int row = 0 ; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                blocks[col][row] = new Block();
                blocks[col][row].setPrefHeight(100);
                blocks[col][row].setPrefWidth(100);
                gridPane.add(blocks[col][row], col, row, 1, 1);

                if (row % 2 == 0 && col % 2 ==1){
                    blocks[col][row].setStyle("-fx-background-color: AAA;");
                }
                if (row % 2 == 1 && col % 2 ==0){
                    blocks[col][row].setStyle("-fx-background-color: AAA;");
                }
            }
        }

        // Setup Pieces
        chessBoard = new Board(blocks);
    }

    private void addGridEvent() {
        gridPane.getChildren().forEach(item -> {
            item.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Node source = (Node) event.getSource();
                    Integer col = GridPane.getColumnIndex(source);
                    Integer row = GridPane.getRowIndex(source);
                    System.out.println("current col is " + col + " , current row is " + row);
                }
            });
        });
    }

    public void loadChessBoard(){

    }

    public void loadWholeGame(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setupBoard();
        addGridEvent();
    }
}
