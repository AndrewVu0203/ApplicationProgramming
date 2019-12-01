package Chess.model;

import java.lang.Math;

public class QueenPiece  extends Piece {
    /* Queen object constructor, sets
        all variables for queen*/
	public QueenPiece(String team, int x, int y) {
        super(PieceType.Queen, team, x, y);
    }

    /* This method will validate whether or not a move is legal */
    @Override
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        int thisX = this.getX();
        int thisY = this.getY();

        if(isCollision(x, y, blocks)) {
            return false;
        }

        if((Math.abs(thisX - x) == Math.abs(thisY - y) && Math.abs(thisX - x) < 8)
                || (Math.abs(thisX - x) < 8 && thisY - y == 0)
                || (thisX - x == 0 && Math.abs(thisX - y) < 8)) {
            //cant jump
//            if(){
//                return false;
//            }
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

            if(thisX == x) {
                if(thisY > y) {
                    i = thisY - 1;
                } else {
                    i = thisY + 1;
                }
                System.out.printf("%d %d\n", i, thisX);

                for(; i != y;) {
                    piece = blocks[x][i].getPiece();
                    if(piece != null) {
                        return true;
                    }

                    if(thisY > y) {
                        i--;
                    }else {
                        i++;
                    }
                }

                for(; i != y;) {
                    piece = blocks[i][i].getPiece();
                    if(piece != null) {
                        return true;
                    }

                    if(thisY > y) {
                        i--;
                    }else {
                        i++;
                    }
                }
                this.setX(x);
                this.setY(y);
            }

            else if(thisY == y) {

                if(thisX > x) {
                    i = thisX - 1;
                }else {
                    i = thisX + 1;
                }

                for(;i != x;) {
                    piece = blocks[i][y].getPiece();
                    if(piece != null) {
                        return true;
                    }
                    if(thisX > x) {
                        i--;
                    }else {
                        i++;
                    }
                }
                for(;i != x;) {
                    piece = blocks[i][i].getPiece();
                    if(piece != null) {
                        return true;
                    }
                    if(thisX > x) {
                        i--;
                    }else {
                        i++;
                    }
                }

                this.setX(x);
                this.setY(y);
            }

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
            if(thisX == x) {

                if(thisY > y) {
                    i = thisY - 1;
                }else {
                    i = thisY + 1;
                }

                for(; i != y;) {
                    piece = blocks[x][i].getPiece();
                    if(piece != null) {
                        return true;
                    }
                    if(thisY > y) {
                        i--;
                    }else {
                        i++;
                    }
                }

                for(; i != y;) {
                    piece = blocks[i][i].getPiece();
                    if(piece != null) {
                        return true;
                    }
                    if(thisY > y) {
                        i--;
                    }else {
                        i++;
                    }
                }
                this.setX(x);
                this.setY(y);
            }
            else if(thisY == y) {

                if(thisX > y) {
                    i = thisX - 1;
                }else {
                    i = thisX + 1;
                }

                for(;i != x;) {
                    piece = blocks[i][y].getPiece();
                    if(piece != null) {
                        return true;
                    }

                    if(thisX > x) {
                        i--;
                    } else {
                        i++;
                    }
                }
                for(;i != x;) {
                    piece = blocks[i][i].getPiece();
                    if(piece != null) {
                        return true;
                    }

                    if(thisX > x) {
                        i--;
                    } else {
                        i++;
                    }
                }

                this.setX(x);
                this.setY(y);
            }
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
        return false;
    }
}
