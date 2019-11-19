package Chess.model;

public class KnightPiece  extends Piece {

    /* Knight object constructor, sets 
        all variables for knight*/
	public KnightPiece(String team, int x, int y) {
        super(PieceType.Knight, team, x, y);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

        /* If there is currently a */
        if(blocks[x][y].getPiece() != null) {
            if(blocks[x][y].getPiece().getTeam().equalsIgnoreCase(super.getTeam())) {
                System.out.println("False");
                return false;
            }
        }

        // thisX = cur pos
        // x = move to pos
        if((thisX - x == -2 && thisY - y == 1) || (thisX - x == 2 && thisY - y == 1) || (thisX - x == -1 &&thisY - y == 2)
                || (thisX - x == 1 && thisY - y == 2)|| (thisX - x == 2 && thisY - y == -1)
                || (thisX - x == -2 && thisY - y == -2) || (thisX - x == 1 && thisY - y == -2)
                || (thisX - x == -1 && thisY - y == -2)) {
            this.setX(x);
            this.setY(y);
            return true;
        }
        return false;
    }
}