package Chess.model;

public class PawnPiece  extends Piece {
	public PawnPiece(String team) {
        super(PieceType.Pawn, team);
    }

    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return true;
    }
}