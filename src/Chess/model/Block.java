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

    public void swapBlockPieces(Block a, Block b){
        // Set piece on block b to a temp variable
        // Get piece on block a, and set it to piece on block b
        // set piece on block b to the temp variable

    }
}
