package Chess.model;

public class RookPiece extends Piece {
    /* Rook object constructor, sets
            all variables for rook*/
	public RookPiece(String team) {
        super(PieceType.Rook, team);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return false;
    }
}