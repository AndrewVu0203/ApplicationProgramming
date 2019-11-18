package Chess.model;

public class PawnPiece  extends Piece {
	public PawnPiece(String team, int x, int y) {
        super(PieceType.Pawn, team, x, y);
    }

    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return true;
    }
}