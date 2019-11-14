package Chess.model;

import Chess.model.Piece;

public class KnightPiece  extends Piece {
	String path;
	public KnightPiece(String team) {
        super("knight", team); 
        this.setPath(team);
    }
	
    public void setPath(String color) {
    	if(color.equalsIgnoreCase("white")) {
    		this.path = "Chess/white_knight.png";
    	}
    		
    	if(color.equalsIgnoreCase("black")) {
    		this.path = "Chess/black_knight.png";
    	}
    }
    
    public String getPath() {
    	return this.path;
    }
}