package Chess.model;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Block extends Button {
    private int x;
    private int y;
    private Piece piece;

    public boolean enPassant = false;
    public Block(){
    }  
     
    public void setEnPasant(boolean bool) {
    	this.enPassant = bool;
    }

    public boolean getEnPasant() {
    	return this.enPassant;
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
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public int getY() {
        return this.y;
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