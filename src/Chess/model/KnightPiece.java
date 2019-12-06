package Chess.model;

import java.lang.Math;

public class KnightPiece  extends Piece {
    /**
     * Knight object constructor, sets
     *         all variables for knigh
     * @param team white or black team
     * @param x x-location
     * @param y y-location
     */
	public KnightPiece(String team, int x, int y) {
        super(PieceType.Knight, team, x, y);
    }

    /**
     * This method will validate whether or not a move is legal
     * @param x x-location
     * @param y y-location
     * @param blocks chessboard
     * @return if the move is valid and can be moved
     */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

        if((Math.abs(thisX - x) == 1 && Math.abs(thisY - y) == 2) || (Math.abs(thisY - y) == 1 && Math.abs(thisX - x) == 2)){
            this.setX(x);
            this.setY(y);
            return true;
        }
        return false;
    }
}