package Chess.model;

public class Piece {
    private int x = -1;
    private int y = -1;
    private String team = "";
    private PieceType pieceType;
    private String imagePath;
    private String path;
    public enum PieceType {Bishop, King, Queen, Pawn, Knight, Rook}
    protected  boolean enPassant;
    protected boolean hasMoved;

    public Piece(){};
    public void setEnPassant(boolean bool) {
    	this.enPassant = bool;
    }  

    public boolean getEnPassant() {
    	return this.enPassant;
    }

    public Piece(PieceType piece, String team, int x, int y){
        this.pieceType = piece;
        this.team = team;
        this.imagePath = "Chess/images/pieces/" + team.toLowerCase() + "_" + piece.toString().toLowerCase() + ".png";
        this.x = x;
        this.y = y;
        this.hasMoved = false;
    }

    /**
     * abbreviate the name to only the first char
     * @param str
     * @return
     */
    public String abbreviate(String str){
        if ("knight".equals(str.toLowerCase()))
            return "Kn";
        else
            return str.substring(0, 1).toUpperCase();
    }

    /**
     * This gets overwritten in each piece
     * @param x
     * @param y
     * @param blocks
     * @return
     */
    public boolean isMoveValid(int x, int y, Block[][] blocks){
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

    public PieceType getPieceType() {
        return pieceType;
    }

}