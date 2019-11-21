package Chess.model;

import java.lang.Math;

public class QueenPiece  extends Piece {
    /* Queen object constructor, sets
        all variables for queen*/
	public QueenPiece(String team, int x, int y) {
        super(PieceType.Queen, team, x, y);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

        if((Math.abs(thisX - x) == Math.abs(thisY - y) && Math.abs(thisX - x) < 8)
                || (Math.abs(thisX - x) < 8 && thisY - y == 0)
                || (thisX - x == 0 && Math.abs(thisX - y) < 8)) {
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
