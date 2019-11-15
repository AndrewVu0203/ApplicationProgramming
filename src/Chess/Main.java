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
//package Chess;
//import Chess.model.Block;
//import Chess.model.Board;
//import Chess.model.Piece;
//import javafx.application.Application;
//import javafx.event.EventHandler;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//    // init() is good for connecting with EventHandler
//    @Override
//    public void init() throws Exception {
//        super.init();
//        System.out.println("init()");
//    }
//
//    static Node source = null;
//    static Node place = null;
//    static Stage ps;
//	static Board chess;
//	static Block block = new Block();
//	static Piece piece = new Piece();
//	
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//    	ps = primaryStage;
//
//        GridPane gridPane = new GridPane();
//
//        Block[][] blocks = new Block[8][8];
//
//        for(int row = 0 ; row < 8; row++) {
//            for (int col = 0; col < 8; col++) {
//                blocks[col][row] = new Block();
//                blocks[col][row].setPrefHeight(100);
//                blocks[col][row].setPrefWidth(100);
//
//                blocks[col][row].setOnMouseClicked(new EventHandler<MouseEvent>() {
//                    @Override
//                    public void handle(MouseEvent event) {
////                    	Piece piece = null;
//                    	Integer originCol = -1;
//                    	Integer originRow = -1;
//                    	Integer destCol = -1;
//                    	Integer destRow = -1;
//                        if(source == null) {
//                        	block = (Block) event.getSource();
//                        	piece = block.getPiece();
//                        	source = (Node) event.getSource(); 	
//                        }
//                        else {
//
//                        	place = (Node) event.getSource();
//                            originCol = GridPane.getColumnIndex(source);
//                            originRow = GridPane.getRowIndex(source);
//                            destCol = GridPane.getColumnIndex(place);
//                            destRow = GridPane.getRowIndex(place);
//                            if(blocks[destCol][destRow].getPiece() != null
//                            		&& blocks[destCol][destRow].getPiece().getTeam().equalsIgnoreCase(piece.getTeam())) {
//                            	block = (Block) event.getSource();
//                            	piece = block.getPiece();
//                            	source = (Node) event.getSource(); 	
//                            }
//                            else if(piece.isMoveValid(destCol, destRow, blocks)){
//                            	blocks[originCol][originRow].removeBlock();
//                                blocks[destCol][destRow].setPiece(piece);
//                                source = null;
//                            }                            
//                        }
//                    }                    
//                });
//                
//                gridPane.add(blocks[col][row], col, row, 1, 1);
//            }
//        }
//        startingPositions(blocks);
//
//        ps.setScene(new Scene(gridPane, 800, 800));
//        ps.show();
//    }
//
//    public void startingPositions(Block block[][]){
//	        chess = new Board(block);
//    }
//    
//    public static void main(String[] args) {
//        launch(args);
//    }
//}