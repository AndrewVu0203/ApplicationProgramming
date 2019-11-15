  
package Chess.model;

import Chess.model.Piece;

public class PawnPiece  extends Piece {
    String path;
    private int x = -1;
    private int y = -1;
	public PawnPiece(String team) {
        super("pawn", team);
        this.setPath(team);
    }
	
    public void setPath(String color) {
    	if(color.equalsIgnoreCase("white")) {
    		this.path = "Chess/images/pieces/white_pawn.png";
    	}
    		
    	if(color.equalsIgnoreCase("black")) {
    		this.path = "Chess/images/pieces/black_pawn.png";
    	}
    }
    
    public String getPath() {
    	return this.path;
    }
    @Override
    public boolean isMoveValid(int x, int y, Block blocks[][]){
    	
		return true;
    }
}