package Chess.model;

import javafx.scene.control.Button;

public class Block extends Button {
    int x;
    int y;
    int color;

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

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
