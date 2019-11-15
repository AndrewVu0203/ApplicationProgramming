package Chess.model;

import Chess.model.Piece;

public class RookPiece extends Piece {
   String path;
   private int x = -1;
   private int y = -1;
	public RookPiece(String team) {
        super(PieceType.Rook, team);
        this.setPath(team);
    }
	
    public void setPath(String color) {
    	if(color.equalsIgnoreCase("white")) {
    		this.path = "Chess/white_rook.png";
    	}
    		
    	if(color.equalsIgnoreCase("black")) {
    		this.path = "Chess/black_rook.png";
    	}
    }
    
    public String getPath() {
    	return this.path;
    }
    @Override
    public boolean isMoveValid(int x, int y, Block blocks[][]){
    	
		return false;
    }
}