package Chess.model;

public class PawnPiece  extends Piece {
	public PawnPiece(String team, int x, int y) {
	    super(PieceType.Pawn, team, x, y);
    }

    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

        String color = this.getTeam();
        if (color.equalsIgnoreCase("black")){
            if(thisX - x == 0 && thisY - y == -1){
                this.setX(x);
                this.setY(y);
                return true;
            }
            if(!hasMoved && (thisX - x == 0 && thisY - y == -2)) {
                this.setX(x);
                this.setY(y);
                return true;
            }
        }

        if (color.equalsIgnoreCase("white")){
            if(thisX - x == 0 && thisY - y == 1){
                this.setX(x);
                this.setY(y);
                this.hasMoved = true;
                return true;
            }
            if(!hasMoved && (thisX - x == 0 && thisY - y == 2)) {
                this.setX(x);
                this.setY(y);
                this.hasMoved = true;
                return true;
            }
        }
        return false;
    }
}