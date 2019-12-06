package Chess.model;

public class RookPiece extends Piece {
    /* Rook object constructor, sets
            all variables for rook*/
	public RookPiece(String team, int x, int y) {
        super(PieceType.Rook, team, x, y);
    }

	/**
	 * This method will validate whether or not a move is legal
	 * @param x x-location
	 * @param y y-location
	 * @param blocks chessboard
	 * @return whether a move can be made
	 */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

        if(isCollision(x, y, blocks)) {
    		return false;
    	}

        if((Math.abs(thisX - x) < 8 && thisY - y == 0) || (thisX - x == 0 && Math.abs(thisX - y) < 8)) {
            this.setX(x);
            this.setY(y);
            return true;
        }
        return false;
    }

	/**
	 * whether a piece is collided with another piece
	 * @param x x-location
	 * @param y y-location
	 * @param blocks chessboard
	 * @return whether a piece is collided with this piece
	 */
    public boolean isCollision(int x, int y, Block[][] blocks) {
    	int i = 0;
    	Piece piece;
    	
    	if(this.getTeam().equalsIgnoreCase("white")) {
    		
    		if(this.getX() == x) {

    			if(this.getY() > y) {
        			i = this.getY() - 1;
    			} else {
        			i = this.getY() + 1;
    			}
    			System.out.printf("%d %d\n", i, this.getX());
	    		
    			for(; i != y;) {

	    			piece = blocks[x][i].getPiece();

	    			if(piece != null) {
	    				return true;
	    			}
	    			
	    			if(this.getY() > y) {
	    				i--;
	    			}else {
	    				i++;
	    			}
	    		}
    			this.setX(x);
	    		this.setY(y);
	    	}
    		else if(this.getY() == y) {
    			
    			if(this.getX() > x) {
        			i = this.getX() - 1;
    			}else {
        			i = this.getX() + 1;
    			}
    			
    			for(;i != x;) {
	    			piece = blocks[i][y].getPiece();
	    			if(piece != null) {
	    				return true;
	    			}
	    			
	    			if(this.getX() > x) {
	    				i--;
	    			}else {
	    				i++;
	    			}
	    		}
    			this.setX(x);
	    		this.setY(y);
	    	}
    	}
    	else if(this.getTeam().equalsIgnoreCase("black")) {
	    	if(this.getX() == x) {
	    		
	    		if(this.getY() > y) {
        			i = this.getY() - 1;
    			}else {
        			i = this.getY() + 1;
    			}
    			
	    		for(; i != y;) {
	    			piece = blocks[x][i].getPiece();
	    			if(piece != null) {
	    				return true;
	    			}
	    			
	    			if(this.getY() > y) {
	    				i--;
	    			}else {
	    				i++;
	    			}
	    		}
    			this.setX(x);
	    		this.setY(y);
	    	}
	    	else if(this.getY() == y) {
	    		
	    		if(this.getX() > y) {
        			i = this.getX() - 1;
    			}else {
        			i = this.getX() + 1;
    			}
    			
	    		for(;i != x;) {
	    			piece = blocks[i][y].getPiece();
	    			
	    			if(piece != null) {
	    				return true;
	    			}
	    			
	    			if(this.getX() > x) {
	    				i--;
	    			} else {
	    				i++;
	    			}
	    		}
	    		
	    		this.setX(x);
	    		this.setY(y);
	    	}
    	}
    	return false;
    }
}