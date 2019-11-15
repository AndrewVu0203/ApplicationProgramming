package Chess.model;

import Chess.model.Piece;

public class KnightPiece  extends Piece {
	String path;
    private int x = -1;
    private int y = -1;

    /* Knight object constructor, sets 
        all variables for knight*/
	public KnightPiece(String team) {
        super(PieceType.Knight, team); 
        this.setPath(team);
    }
	
	/* Set the variables for the knight */
    public void setPath(String color) {

        /* Check for color to set appropriate co-ordinates */
    	if(color.equalsIgnoreCase("white")) {
    		this.path = "Chess/white_knight.png";
    	}
    		
    	if(color.equalsIgnoreCase("black")) {
    		this.path = "Chess/black_knight.png";
    	}
    }
    
    /* Return the path as a string */
    public String getPath() {
    	return this.path;
    }

    /* This method will validate wether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block blocks[][]){
    	
		return false;
    }
}