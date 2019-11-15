package Chess.model;

public class QueenPiece  extends Piece {
	public QueenPiece(String team) {
        super(PieceType.Queen, team);
    }

    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return true;
    }
}