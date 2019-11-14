//package Chess.model;
//
//public class Piece {
//    String name;
//    String[] pos;
//    String[] oldPos = {"x","x"};
//    String team;
//    Block curPos;
//    String pieceType;
//	String path;
//    enum PieceType
//    {
//        Bishop, King, Queen, Pawn, Knight, Rock
//    }
//
//    public Piece(Piece piece) {
//
//    }
//
//    public Piece(String piece, String team){
//        this.name = Abbreviate(piece);
//        this.team = team;
//    }
//
//    public void setPosition(String[] pos){
//        this.pos = pos;
//    }
//
//    public String[] getPosition(){
//        return this.pos;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    private String Abbreviate(String str){
//        if ("knight".equals(str.toLowerCase())) return "Kn";
//        else return str.substring(0, 1).toUpperCase();
//    }
//
//    boolean isMoveValid(){
//        return false;
//    }
//
//    void move(Block pos){
//
//    }
//    public String getPath() {
//		return path;
//    }
//}