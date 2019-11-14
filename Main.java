package Chess;
import Chess.model.Block;
import Chess.model.Board;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	static Board chess;
    // init() is good for connecting with EventHandler
    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("init()");
    }

    static Node source = null;
    static Node place = null;
    static Stage ps;

    @Override
    public void start(Stage primaryStage) throws Exception{
    	ps = primaryStage;

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
//                    	Piece piece = null;
                    	Integer col = -1;
                    	Integer row = -1;
                        if(source == null) {
                        	source = (Node) event.getSource();
                            col = GridPane.getColumnIndex(source);
                            row = GridPane.getRowIndex(source);
                        }
                        else {
                        	place = (Node) event.getSource();
                            col = GridPane.getColumnIndex(place);
                            row = GridPane.getRowIndex(place);
                            blocks[col][row].setGraphic(source);
                            
                            source = null;
                            
                        }

                        
                        System.out.println("current col is " + col + " , current row is " + row);

                    }
                    
                    
                });
                
                gridPane.add(blocks[col][row], col, row, 1, 1);
            }
        }
        startingPositions(blocks);

        ps.setScene(new Scene(gridPane, 800, 800));
        ps.show();
    }

    public void startingPositions(Block block[][]){
	        chess = new Board(block);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}