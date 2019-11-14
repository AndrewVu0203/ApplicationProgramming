package Chess.model;

import Chess.model.Piece;

public class BishopPiece extends Piece {
	String path;
    public BishopPiece(String team) {
        super("bishop", team);
        this.setPath(team);
    }
	
    public void setPath(String color) {
    	if(color.equalsIgnoreCase("white")) {
    		this.path = "Chess/white_bishop.png";
    	}
    		
    	if(color.equalsIgnoreCase("black")) {
    		this.path = "Chess/black_bishop.png";
    	}
    }
    @Override
    public String getPath() {
		return this.path;
    }
}