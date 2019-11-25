package Chess.controller;

import Chess.Main;
import Chess.model.Block;
import Chess.model.Board;
import Chess.model.Piece;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {
    @FXML GridPane gridPane;
    @FXML ListView listView;
    private Board chessBoard;
    private Block[][] blocks = new Block[8][8];
    private Node source = null;
    private Node place = null;
	private Block block = new Block();
	private Piece piece = new Piece();
    ObservableList<String> observableList = FXCollections.observableArrayList();
	
	boolean turn = true;

    // load the chessboard
    public void setupBoard(){
        for(int row = 0 ; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                blocks[col][row] = new Block();
                blocks[col][row].setPrefHeight(100);
                blocks[col][row].setPrefWidth(100);

                gridPane.add(blocks[col][row], col, row, 1, 1);

                blocks[col][row].setStyle("-fx-background-color: FFFFFF;");

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

    public void setUpHistoryLog(){
        listView.setItems(observableList);
    }

    // load event for each Block
    // source : current location of chess piece
    // destination : location that we want to move chess piece to
    private void addGridEvent() {
        gridPane.getChildren().forEach(item -> {
            item.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    // Moving of pieces
                    Integer originCol = -1;
                    Integer originRow = -1;
                    Integer destCol = -1;
                    Integer destRow = -1;
                    if(source == null) {
                        block = (Block) event.getSource();
                        piece = block.getPiece();
                        if(piece == null){}
                        else if(isTurn(piece)){
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
                            observableList.addAll(block.getPiece().getPieceType().toString()
                                    + " from " + originCol + "-" + originRow
                                    + " to " + destCol + "-" + destRow);
                            blocks[originCol][originRow].removeBlock();
                            blocks[destCol][destRow].setPiece(piece);
                            source = null;
                        }
                    }
                }
            });
        });
    }

    public void quit(ActionEvent e) {
        System.exit(1);
    }

    public void backToMenu(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Chess/view/Menu.fxml"));
        Parent root = loader.load();
        Main.stage.setScene(new Scene(root));
        Main.stage.show();
    }

    // init() will always get called first
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setupBoard();
        addGridEvent();
        setUpHistoryLog();
    }

    public boolean isTurn(Piece piece) {
    	
    	if(piece.getTeam().equalsIgnoreCase("white") && this.turn) {
    		this.turn = false;
    		return true;
    	}
    	else if(piece.getTeam().equalsIgnoreCase("black") && !this.turn) {
    		this.turn = true;
    		return true;
    	}
    	
    	return false;
    }

    public boolean isCollision(int x, int y, Piece piece) {
    	
    	int xDist = Math.abs(piece.getX() - x);
    	int yDist = Math.abs(piece.getY() - y);
    	
    	return false;
    }
}
