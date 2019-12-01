package Chess.model;

public class PawnPiece  extends Piece {
	public PawnPiece(String team, int x, int y) {
	    super(PieceType.Pawn, team, x, y);
    }

    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

        String color = this.getTeam();
        
        if(canAttack(blocks, x, y)){
        	return true;
        }
        
        if(isCollision(y, blocks, color)) {
        	return false;
        }
        
        if (color.equalsIgnoreCase("black")){
            if(thisX - x == 0 && thisY - y == -1){
                this.setX(x);
                this.setY(y);
                if(this.enPassant == true) {
                	this.setEnPassant(false);
                    blocks[x][y-2].setEnPasantW(true);
                }
                return true;
            }
            if(!hasMoved && (thisX - x == 0 && thisY - y == -2)) {
                this.setX(x);
                this.setY(y);
                blocks[x][y-1].setEnPasantW(true);
                return true;
            }
        }

        if (color.equalsIgnoreCase("white")){
            if(thisX - x == 0 && thisY - y == 1){
                this.setX(x);
                this.setY(y);
                this.hasMoved = true;
                if(this.enPassant == true) {
                	this.setEnPassant(false);
                    blocks[x][y+2].setEnPasantB(true);
                }
                return true;
            }
            if(!hasMoved && (thisX - x == 0 && thisY - y == 2)) {
                this.setX(x);
                this.setY(y);
                blocks[x][y+1].setEnPasantB(true);
                this.hasMoved = true;
                return true;
            }
        }
        return false;
    }
    
    public boolean isCollision(int y, Block[][] blocks, String color) {
    	int dist = Math.abs(this.getY() - y);
    	Piece piece;
    	Block block;

    	if (color.equalsIgnoreCase("black")) {
    	    for(int i = 1; i <= dist; i++) {
    	        piece = blocks[this.getX()][this.getY() + i].getPiece();
    	        if(piece != null) {
    	            return true;
    	        }
    	    }
    	}
    	if (color.equalsIgnoreCase("white")) {
    	    for(int i = 1; i <= dist; i++) {
    	        block = blocks[this.getX()][this.getY() - i];
    	        piece = block.getPiece();
    	        if(piece != null) {
    	            return true;
    	        }
    	    }
    	}
    	return false;
    }
    
  public boolean canAttack(Block[][] blocks, int x, int y) {
    	Piece piece;
    	
    	if(Math.abs(this.getX()-x) == 1 && Math.abs(this.getY() - y) == 1) {

    		piece = blocks[x][y].getPiece();  
    		
    		if(piece != null) {
    			this.setX(x);
                this.setY(y);
    			return true;
    		}
    		
    		
    		if(blocks[x][y].getEnPasantW()) {
    			if(this.getTeam().equalsIgnoreCase("black")) {
        			this.setX(x);
                    this.setY(y);
                    blocks[x][y-1].removeBlock();
                    blocks[x][y].setEnPasantW(false);
        			return true;
    			}
    		}
    		
    		
    		else if(blocks[x][y].getEnPasantB()) {   			
    			if(this.getTeam().equalsIgnoreCase("white")){
        			this.setX(x);
                    this.setY(y);
	                blocks[x][y+1].removeBlock();
	                blocks[x][y].setEnPasantB(false);
        			return true;
    			}
    			
    		}
    	}
    	
    	return false;
    }
}