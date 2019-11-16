package Chess.model;

public class QueenPiece  extends Piece {
    /* Queen object constructor, sets
        all variables for queen*/
	public QueenPiece(String team) {
        super(PieceType.Queen, team);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return true;
    }
}