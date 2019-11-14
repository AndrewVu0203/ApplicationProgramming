//package Chess.model;
//
//import Chess.model.Piece;
//
//public class QueenPiece  extends Piece {
//    String path;
//	public QueenPiece(String team) {
//        super("queen", team);
//        this.setPath(team);
//    }
//
//    public void setPath(String color) {
//    	if(color.equalsIgnoreCase("white")) {
//    		this.path = "Chess/white_queen.png";
//    	}
//
//    	if(color.equalsIgnoreCase("black")) {
//    		this.path = "Chess/black_queen.png";
//    	}
//    }
//
//    public String getPath() {
//    	return this.path;
//    }
//}