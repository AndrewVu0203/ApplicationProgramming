package Chess.model;

public class BishopPiece extends Piece {

    /* Bishop object constructor, sets
        all variables for bishop*/
    public BishopPiece(String team) {
        super(PieceType.Bishop, team);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
		return true;
    }
}