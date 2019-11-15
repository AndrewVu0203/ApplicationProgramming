package Chess.model;

import Chess.model.Piece;

public class BishopPiece extends Piece {
	String path;
    private int x = -1;
    private int y = -1;

    /* */
    public BishopPiece(String team) {
        super(PieceType.Bishop, team);
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
    @Override
    public boolean isMoveValid(int x, int y, Block blocks[][]){
    	
		return false;
    }
}