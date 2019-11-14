package Chess.model;

import Chess.model.Piece;

public class QueenPiece  extends Piece {
    public QueenPiece(String team) {
        super(PieceType.Bishop, team);
    }
}