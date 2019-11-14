//package Chess.model;
//
//import Chess.model.Piece;
//
//public class RookPiece extends Piece {
//   String path;
//	public RookPiece(String team) {
//        super("rook", team);
//        this.setPath(team);
//    }
//
//    public void setPath(String color) {
//    	if(color.equalsIgnoreCase("white")) {
//    		this.path = "Chess/white_rook.png";
//    	}
//
//    	if(color.equalsIgnoreCase("black")) {
//    		this.path = "Chess/black_rook.png";
//    	}
//    }
//
//    public String getPath() {
//    	return this.path;
//    }
//}