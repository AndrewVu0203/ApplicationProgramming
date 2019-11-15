package Chess.model;

public class RookPiece extends Piece {

	public RookPiece(String team) {
        super(PieceType.Rook, team);
    }

    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return false;
    }
}