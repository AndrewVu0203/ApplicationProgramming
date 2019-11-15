package Chess.model;

import Chess.model.Piece;

public class QueenPiece  extends Piece {
    String path;
    private int x = -1;
    private int y = -1;
	public QueenPiece(String team) {
        super(PieceType.Queen, team);
        this.setPath(team);
    }
	
    public void setPath(String color) {
    	if(color.equalsIgnoreCase("white")) {
    		this.path = "Chess/white_queen.png";
    	}
    		
    	if(color.equalsIgnoreCase("black")) {
    		this.path = "Chess/black_queen.png";
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