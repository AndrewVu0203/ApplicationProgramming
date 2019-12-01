package Chess.model;

public class BishopPiece extends Piece {

    /* Bishop object constructor, sets
        all variables for bishop*/
    public BishopPiece(String team, int x, int y) {
        super(PieceType.Bishop, team, x, y);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks) {
        int thisX = this.getX();
        int thisY = this.getY();

        if (isCollision(x, y, blocks)) {
            return false;
        }

        if (Math.abs(thisX - x) == Math.abs(thisY - y) && Math.abs(thisX - x) < 8) {
            this.setX(x);
            this.setY(y);
            return true;
        }
        return false;
    }

    public boolean isCollision(int x, int y, Block[][] blocks) {
        int dist = Math.abs(this.getY() - y);
        int i;
        int thisX = this.getX();
        int thisY = this.getY();
        Piece piece;

        if(this.getTeam().equalsIgnoreCase("white")) {
            if(thisX < x && thisY < y){
                for(i = 1; i < dist; i++) {
                    piece = blocks[this.getX() + i][this.getY() + i].getPiece();
                    if (piece != null) {
                        return true;
                    }
                }
                this.setX(x);
                this.setY(y);
            }else if(thisX > x && thisY > y){
                for(i = 1; i < dist; i++) {
                    piece = blocks[this.getX() - i][this.getY() - i].getPiece();
                    if (piece != null) {
                        return true;
                    }
                }
                this.setX(x);
                this.setY(y);
            }else if (thisX < x && thisY >y){
                for(i = 1; i < dist; i++) {
                    piece = blocks[this.getX() + i][this.getY() - i].getPiece();
                    if (piece != null) {
                        return true;
                    }
                }
                this.setX(x);
                this.setY(y);
            }else if (thisX > x && thisY < y ){
                for(i = 1; i < dist; i++) {
                    piece = blocks[this.getX() - i][this.getY() + i].getPiece();
                    if (piece != null) {
                        return true;
                    }
                }
                this.setX(x);
                this.setY(y);
            }
        }
        else if(this.getTeam().equalsIgnoreCase("black")) {
            if(thisX < x && thisY < y){
                for(i = 1; i < dist; i++) {
                    piece = blocks[this.getX() + i][this.getY() + i].getPiece();
                    if (piece != null) {
                        return true;
                    }
                }
                this.setX(x);
                this.setY(y);
            }else if(thisX > x && thisY > y){
                for(i = 1; i < dist; i++) {
                    piece = blocks[this.getX() - i][this.getY() - i].getPiece();
                    if (piece != null) {
                        return true;
                    }
                }
                this.setX(x);
                this.setY(y);
            }else if (thisX < x && thisY >y){
                for(i = 1; i < dist; i++) {
                    piece = blocks[this.getX() + i][this.getY() - i].getPiece();
                    if (piece != null) {
                        return true;
                    }
                }
            }else if (thisX > x && thisY < y ){
                for(i = 1; i < dist; i++) {
                    piece = blocks[this.getX() - i][this.getY() + i].getPiece();
                    if (piece != null) {
                        return true;
                    }
                }
                this.setX(x);
                this.setY(y);
            }
        }
        return false;
    }
}
