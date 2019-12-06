package Chess.model;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Block extends Button {
    private int x;
    private int y;
    private Piece piece;

    public boolean enPassantW = false;
    public boolean enPassantB = false;
    public Block(){
    }

    /**
     * special function to know if en pasant is true or not
     * @param bool en pasant true or false
     */
    public void setEnPasantW(boolean bool) {
    	this.enPassantW = bool;
    }

    /**
     * @return get whether en pasant true or false
     */
    public boolean getEnPasantW() {
    	return this.enPassantW;
    }

    /**
     * set en pasant true or not
     * @param bool en pasant true or false
     */
    public void setEnPasantB(boolean bool) {
    	this.enPassantB = bool;
    }

    /**
     * get whether en pasant true or not
     * @return
     */
    public boolean getEnPasantB() {
    	return this.enPassantB;
    }
    /* Method which resets the state of a block */

    /**
     * remove block
     */
    public void removeBlock() {
    	this.setGraphic(null);
    	this.piece = null;
    }

    /**
     * constructor
     * @param text
     */
    public Block(String text){
        super(text);
    }

    /**
     *
     * @return x-location
     */
    public int getX() {
        return this.x;
    }

    /**
     * set x-location
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * get the current piece
     * @return
     */
    public Piece getPiece() {
        return this.piece;
    }

    /**
     * get y-location
     * @return y-location
     */
    public int getY() {
        return this.y;
    }

    /**
     * set y-location
     * @param y the y-location
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * set piece to the block
     * @param piece the piece that will be set
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
        ImageView image = new ImageView(new Image(this.piece.getImagePath()));
        this.setGraphic(image);
    }    
}