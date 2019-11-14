package Chess.model;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Block extends Button {
    int x;
    int y;
    int color;
    Piece piece = null;
    
    public Block(){
    	
    }
    
    public void setPiece(Piece piece, int x, int y) {
    	
    }
    public void setPiece(Piece piece) {
    	this.piece = piece;
		ImageView blackKing = new ImageView(new Image(piece.getPath()));
        this.setGraphic(blackKing);
    }
    public Block(Piece piece, int x, int y) {
    	this.piece = new Piece(piece);
    	this.x = x;
    	this.y = y;
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

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}