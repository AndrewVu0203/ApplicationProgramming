//
//package Chess.model;
//
//import Chess.model.Piece;
//
//public class PawnPiece  extends Piece {
//    String path;
//	public PawnPiece(String team) {
//        super("pawn", team);
//        this.setPath(team);
//    }
//
//    public void setPath(String color) {
//    	if(color.equalsIgnoreCase("white")) {
//    		this.path = "Chess/white_pawn.png";
//    	}
//
//    	if(color.equalsIgnoreCase("black")) {
//    		this.path = "Chess/black_pawn.png";
//    	}
//    }
//
//    public String getPath() {
//    	return this.path;
//    }
//}