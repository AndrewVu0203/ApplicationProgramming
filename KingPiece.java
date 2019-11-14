package Chess.model;

import Chess.model.Piece;

public class KingPiece  extends Piece {
    String path;
    
	public KingPiece(String team) {
        super("king", team);
        this.setPath(team);
    }
	
    public void setPath(String color) {
    	if(color.equalsIgnoreCase("white")) {
    		this.path = "Chess/white_king.png";
    	}
    		
    	if(color.equalsIgnoreCase("black")) {
    		this.path = "Chess/black_king.png";
    	}
    }
    @Override
    public String getPath() {
		return this.path;
    }
}