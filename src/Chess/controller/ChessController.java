package Chess.controller;

import Chess.model.Block;
import Chess.model.Piece;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
                gridPane.add(blocks[col][row], col, row, 1, 1);

                if (row % 2 == 0 && col % 2 ==1){
                    blocks[col][row].setStyle("-fx-background-color: AAA;");
                }
                if (row % 2 == 1 && col % 2 ==0){
                    blocks[col][row].setStyle("-fx-background-color: AAA;");
                }
            }
        }

        // Setup images
        startingPositions(blocks);
    }

    public void startingPositions(Block block[][]){
        ImageView temp;

        block[4][0].setPiece(new Piece(Piece.PieceType.King, "Black"));
        temp = new ImageView(new Image(block[4][0].getPiece().getImagePath()));
        block[4][0].setGraphic(temp);

        block[3][0].setPiece(new Piece(Piece.PieceType.Queen, "Black"));
        temp = new ImageView(new Image(block[3][0].getPiece().getImagePath()));
        block[3][0].setGraphic(temp);

        block[5][0].setPiece(new Piece(Piece.PieceType.Bishop, "Black"));
        temp = new ImageView(new Image(block[5][0].getPiece().getImagePath()));
        block[5][0].setGraphic(temp);
        block[2][0].setPiece(new Piece(Piece.PieceType.Bishop, "Black"));
        temp = new ImageView(new Image(block[2][0].getPiece().getImagePath()));
        block[2][0].setGraphic(temp);

        block[6][0].setPiece(new Piece(Piece.PieceType.Knight, "Black"));
        temp = new ImageView(new Image(block[6][0].getPiece().getImagePath()));
        block[6][0].setGraphic(temp);
        block[1][0].setPiece(new Piece(Piece.PieceType.Knight, "Black"));
        temp = new ImageView(new Image(block[1][0].getPiece().getImagePath()));
        block[1][0].setGraphic(temp);

        block[7][0].setPiece(new Piece(Piece.PieceType.Rook, "Black"));
        temp = new ImageView(new Image(block[7][0].getPiece().getImagePath()));
        block[7][0].setGraphic(temp);
        block[0][0].setPiece(new Piece(Piece.PieceType.Rook, "Black"));
        temp = new ImageView(new Image(block[0][0].getPiece().getImagePath()));
        block[0][0].setGraphic(temp);

        for(int i = 0 ; i < 8 ; i++){
            block[i][1].setPiece(new Piece(Piece.PieceType.Pawn, "Black"));
            temp = new ImageView(new Image(block[i][1].getPiece().getImagePath()));
            block[i][1].setGraphic(temp);
        }

        block[3][7].setPiece(new Piece(Piece.PieceType.King, "White"));
        temp = new ImageView(new Image(block[3][7].getPiece().getImagePath()));
        block[3][7].setGraphic(temp);

        block[4][7].setPiece(new Piece(Piece.PieceType.Queen, "White"));
        temp = new ImageView(new Image(block[4][7].getPiece().getImagePath()));
        block[4][7].setGraphic(temp);

        block[5][7].setPiece(new Piece(Piece.PieceType.Bishop, "White"));
        temp = new ImageView(new Image(block[5][7].getPiece().getImagePath()));
        block[5][7].setGraphic(temp);
        block[2][7].setPiece(new Piece(Piece.PieceType.Bishop, "White"));
        temp = new ImageView(new Image(block[2][7].getPiece().getImagePath()));
        block[2][7].setGraphic(temp);

        block[6][7].setPiece(new Piece(Piece.PieceType.Knight, "White"));
        temp = new ImageView(new Image(block[6][7].getPiece().getImagePath()));
        block[6][7].setGraphic(temp);
        block[1][7].setPiece(new Piece(Piece.PieceType.Knight, "White"));
        temp = new ImageView(new Image(block[1][7].getPiece().getImagePath()));
        block[1][7].setGraphic(temp);

        block[7][7].setPiece(new Piece(Piece.PieceType.Rook, "White"));
        temp = new ImageView(new Image(block[7][7].getPiece().getImagePath()));
        block[7][7].setGraphic(temp);
        block[0][7].setPiece(new Piece(Piece.PieceType.Rook, "White"));
        temp = new ImageView(new Image(block[0][7].getPiece().getImagePath()));
        block[0][7].setGraphic(temp);

        for(int i = 0 ; i < 8 ; i++){
            block[i][6].setPiece(new Piece(Piece.PieceType.Pawn, "White"));
            temp = new ImageView(new Image(block[i][6].getPiece().getImagePath()));
            block[i][6].setGraphic(temp);
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
