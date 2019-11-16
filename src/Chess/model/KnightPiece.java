package Chess.model;

public class KnightPiece  extends Piece {

    /* Knight object constructor, sets 
        all variables for knight*/
	public KnightPiece(String team) {
        super(PieceType.Knight, team);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return false;
    }
}