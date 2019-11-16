package Chess.controller;

import Chess.model.Block;
import Chess.model.Board;
import Chess.model.Piece;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {
    @FXML GridPane gridPane;
    private Board chessBoard;
    private Block[][] blocks = new Block[8][8];
    private Node source = null;
    private Node place = null;
	private Block block = new Block();
	private Piece piece = new Piece();

    // load the chessboard
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

    // load event for each Block
    private void addGridEvent() {
        gridPane.getChildren().forEach(item -> {
            item.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Node src = (Node) event.getSource();
                    Integer col = GridPane.getColumnIndex(src);
                    Integer row = GridPane.getRowIndex(src);
                    System.out.println("current col is " + col + " , current row is " + row);

                    // Moving of pieces
                    // TODO: Fix error: If the user clicks on nothing, and tries to move it
                    // TODO: Can't move only the black queen?
                    Integer originCol = -1;
                    Integer originRow = -1;
                    Integer destCol = -1;
                    Integer destRow = -1;
                    if(source == null) {
                        block = (Block) event.getSource();
                        piece = block.getPiece();
                        if(piece == null){}
                        else{
                            source = (Node) event.getSource();
                        }
                    }
                    else {

                        place = (Node) event.getSource();
                        originCol = GridPane.getColumnIndex(source);
                        originRow = GridPane.getRowIndex(source);
                        destCol = GridPane.getColumnIndex(place);
                        destRow = GridPane.getRowIndex(place);
                        if(blocks[destCol][destRow].getPiece() != null
                                && blocks[destCol][destRow].getPiece().getTeam().equalsIgnoreCase(piece.getTeam())) {
                            block = (Block) event.getSource();
                            piece = block.getPiece();
                            source = (Node) event.getSource();
                        }
                        else if(piece.isMoveValid(destCol, destRow, blocks)){
                            blocks[originCol][originRow].removeBlock();
                            blocks[destCol][destRow].setPiece(piece);
                            source = null;
                        }
                    }
                }
            });
        });
    }

    // init() will always get called first
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setupBoard();
        addGridEvent();
    }
}
