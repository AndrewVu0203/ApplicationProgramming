package Chess.model;

public class KingPiece  extends Piece {
	
    public KingPiece(String team, int x, int y) {
        super(PieceType.King, team, x, y);
    }
    
    /* Determine wether the player is making a valid move */
    @Override
    public boolean isMoveValid(int x, int y, Block blocks[][]){
		int thisX = this.getX();
		int thisY = this.getY();

		if(canCastle(x, y, blocks)) {
			this.hasMoved = true;
			this.setX(x);
    		this.setY(y);
			return true;
		}
		
		/* If there is currently a */
    	if(blocks[x][y].getPiece() != null) {
    		if(blocks[x][y].getPiece().getTeam().equalsIgnoreCase(super.getTeam())) {
    			System.out.println("False");
    			return false;
    		}
    	}

		if((Math.abs(thisX - x) == 1 && Math.abs(thisY - y) == 0) || (Math.abs(thisX - x) == 0 && Math.abs(thisY - y) == 1)
				|| (Math.abs(thisX - x) == 1 && (Math.abs(thisX - x) == Math.abs(thisY - y)))){
    		this.setX(x);
    		this.setY(y);
    		return true;
    	}
		return false;
    }
    
    
    public boolean canCastle(int x, int y, Block block[][]) {
    	int i = 0;
    	Piece piece;
    	
    	if(this.getX() - x == -2 && this.hasMoved == false) {
    		i = this.getX() + 1;
    		for(;i < this.getX() + 3;i++) {
    			piece = block[i][y].getPiece();
    			if(piece != null) {
    				return false;
    			}
    		}
    		
    		if(this.getTeam().equalsIgnoreCase("white")) {
    			piece = block[7][7].getPiece();
    			if (piece.hasMoved == false && this.hasMoved == false){
    				block[6][7].setPiece(this);
    				block[5][7].setPiece(piece);
        			piece.setX(5);
        			piece.setY(7);
        			block[7][7].removeBlock();
        			block[this.getX()][this.getY()].removeBlock();
        			return true;
    			}
    		}
    		else if(this.getTeam().equalsIgnoreCase("black")){
    			piece = block[7][0].getPiece();
    			if (piece.hasMoved == false && this.hasMoved == false){
    				block[6][0].setPiece(this);
    				block[5][0].setPiece(piece);
        			piece.setX(5);
        			piece.setY(0);
        			block[7][0].removeBlock();
        			block[this.getX()][this.getY()].removeBlock();
        			return true;
    			}
    		}
    	}
    	
    	else if(this.getX() - x == 2 && this.hasMoved == false){
    		i = this.getX() - 1;
    		for(;i < this.getX() - 3; i--) {
    			piece = block[i][y].getPiece();
    			if(piece != null) {
    				return false;
    			}
    		}
    		if(this.getTeam().equalsIgnoreCase("white")) {
        		piece = block[0][7].getPiece();
        		if (piece.hasMoved == false && this.hasMoved == false){
        			block[2][7].setPiece(this);
        			block[3][7].setPiece(piece);
        			piece.setX(3);
        			piece.setY(7);
            		block[0][7].removeBlock();
            		block[this.getX()][this.getY()].removeBlock();
            		return true;
        		}
        	}
        	else if(this.getTeam().equalsIgnoreCase("black")){
        		piece = block[0][0].getPiece();
        		if (piece.hasMoved == false && this.hasMoved == false){
        			block[2][0].setPiece(this);
        			block[3][0].setPiece(piece);
        			piece.setX(3);
        			piece.setY(0);
            		block[0][0].removeBlock();
            		block[this.getX()][this.getY()].removeBlock();
            		return true;
        		}
        	}
    	}    	
    	return false;
    }
}