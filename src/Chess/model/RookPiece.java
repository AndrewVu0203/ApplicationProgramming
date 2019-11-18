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
		return false;
    }
}