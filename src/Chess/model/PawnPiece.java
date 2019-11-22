package Chess.model;

public class PawnPiece  extends Piece {
	public PawnPiece(String team, int x, int y) {
	    super(PieceType.Pawn, team, x, y);
    }

    private boolean hasMoved = false;

    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

            if(thisX - x == 0 && Math.abs(thisY - y) == 1){
                this.setX(x);
                this.setY(y);
                this.hasMoved = true;
                return true;
            }
            if(!hasMoved && (thisX - x == 0 && Math.abs(thisY - y) == 2 )) {
                this.setX(x);
                this.setY(y);
                this.hasMoved = true;
                return true;
            }
        
        
        return false;
    }
}