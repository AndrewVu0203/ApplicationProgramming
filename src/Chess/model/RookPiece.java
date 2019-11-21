package Chess.model;

public class RookPiece extends Piece {
    /* Rook object constructor, sets
            all variables for rook*/
	public RookPiece(String team, int x, int y) {
        super(PieceType.Rook, team, x, y);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

        if((Math.abs(thisX - x) < 8 && thisY - y == 0) || (thisX - x == 0 && Math.abs(thisX - y) < 8)) {
            //cant jump
//            if(){
//                return false;
//            }
            this.setX(x);
            this.setY(y);
            return true;
        }
        return false;
    }
}