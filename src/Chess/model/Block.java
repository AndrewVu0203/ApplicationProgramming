package Chess.model;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Block extends Button {
    int x;
    int y;
    int color;
    Piece piece;

    public Block(){
    }  
     
    /* Method which resets the state of a block */
    public void removeBlock() {
    	this.setGraphic(null);
    	this.piece = null;
    }

    public Block(String text){
        super(text);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        ImageView image = new ImageView(new Image(this.piece.getImagePath()));
        this.setGraphic(image);
    }    
}
//package Chess.model;
//
//import javafx.scene.control.Button;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//
//public class Block extends Button {
//    int x;
//    int y;
//    int color;
//    private Piece piece = null;
//    
//    public Block(){
//    	
//    }
//    
//    public void removeBlock() {
//    	this.setGraphic(null);
//    	this.piece = null;
//    }
//    public Piece getPiece() {
//    	return this.piece;
//    }
//    
//    public void setPiece(Piece piece) {
//    	this.piece = piece;
//		ImageView image = new ImageView(new Image(piece.getPath()));
//        this.setGraphic(image);
//    }
//    
//    public Block(Piece piece, int x, int y) {
//    	this.piece = new Piece();
//    	this.x = x;
//    	this.y = y;
//    }
//    
//    public Block(String text){
//        super(text);
//    }
//    
//
//    public int getX() {
//        return x;
//    }
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//}