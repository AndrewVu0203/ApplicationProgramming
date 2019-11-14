package Chess.model;

public class Piece {
    String[] pos;
    String[] oldPos = {"x","x"};
    String team;
    PieceType pieceType;
    String imagePath;
    public enum PieceType {Bishop, King, Queen, Pawn, Knight, Rook}

    public Piece(PieceType piece, String team){
        this.pieceType = piece;
        this.team = team;
        this.imagePath = "Chess/images/pieces/" + team.toLowerCase() + "_" + piece.toString().toLowerCase() + ".png";
    }

    public void setPosition(String[] pos){
        this.pos = pos;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String[] getPosition(){
        return this.pos;
    }

    public String getImagePath() {
        return imagePath;
    }

    private String abbreviate(String str){
        if ("knight".equals(str.toLowerCase())) return "Kn";
        else return str.substring(0, 1).toUpperCase();
    }

    boolean isMoveValid(){
        return false;
    }

    void move(Block pos){

    }

}