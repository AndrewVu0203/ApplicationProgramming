package Chess.model;

import Chess.model.Piece;

public class KingPiece  extends Piece {
    String path;
    private int x = -1;
    private int y = -1;
	
    public KingPiece(String team) {
        super(PieceType.King, team);
        this.setPath(team);
    }
	
	/* Were jsut setting up the variables for this piece */
    public void setPath(String color) {
    	

    	/* Determine color of the Piece to set 
    	   appropriate co-ordinates  */
    	if(color.equalsIgnoreCase("white")) {
    		this.path = "Chess/images/pieces/white_king.png";
    		this.x = 3;
    		this.y = 7;
    	}
    		
    	if(color.equalsIgnoreCase("black")) {
    		this.path = "Chess/images/pieces/black_king.png";
    		this.x = 4;
    		this.y = 0;
    	}
    }
    
    /* return the path string */
    @Override
    public String getPath() {
    	return this.path;
    }
    
    /* Determine wether the player is making a valid move */
    @Override
    public boolean isMoveValid(int x, int y, Block blocks[][]){
    
        /* If there is currently a */
    	if(blocks[x][y].getPiece() != null) {
    		if(blocks[x][y].getPiece().getTeam().equalsIgnoreCase(this.team)) {
    			System.out.println("False");
    			return false;
    		}
    	}
    	if((this.x - x == 1 && this.y - y == 1) || (this.x - x == 1 && this.y - y == 0) || (this.x - x == 1 &&this.y - y == -1)
    			|| (this.x - x == 0 && this.y - y == 1) || (this.x - x == 0 &&this.y - y == 0)|| (this.x - x == 0 && this.y - y == -1)
    			|| (this.x - x == -1 && this.y - y == 1) || (this.x - x == -1 &&this.y - y == 0)|| (this.x - x == -1 && this.y - y == -1)) {
    		this.x = x;
    		this.y = y;
    		return true;
    	}
		return false;
    }
}