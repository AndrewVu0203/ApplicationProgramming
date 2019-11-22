package Chess.model;

public class Piece {
    private int x = -1;
    private int y = -1;
    private String team = "";
    private PieceType pieceType;
    private String imagePath;
    private String path;
    public enum PieceType {Bishop, King, Queen, Pawn, Knight, Rook}


    public Piece(){};

    public Piece(PieceType piece, String team, int x, int y){
        this.pieceType = piece;
        this.team = team;
        this.imagePath = "Chess/images/pieces/" + team.toLowerCase() + "_" + piece.toString().toLowerCase() + ".png";
        this.x = x;
        this.y = y;
    }

    public String abbreviate(String str){
        if ("knight".equals(str.toLowerCase()))
            return "Kn";
        else
            return str.substring(0, 1).toUpperCase();
    }

    // This gets overwritten in each piece
    public boolean isMoveValid(int x, int y, Block[][] blocks){
        // Needs to return true
        return false;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getTeam() {
    	return this.team;
    }

    public String getPath() {
		return path;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}