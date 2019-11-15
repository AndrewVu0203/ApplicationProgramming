package Chess.model;

public class BishopPiece extends Piece {

    public BishopPiece(String team) {
        super(PieceType.Bishop, team);
    }

    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return true;
    }
}