//package TempCode;
//
//public class Board{
//    Team whiteTeam;
//    Team blackTeam;
//
//    public Board(){
//        this.whiteTeam = new Team("White");
//        this.blackTeam = new Team("Black");
//    }
//    public Board(Block block[][]) {
//    	Piece BKing = new KingPiece("Black");
//        Piece WKing = new KingPiece("White");
//        Piece BQueen = new QueenPiece("Black");
//        Piece WQueen = new QueenPiece("White");
//        Piece BBishop = new BishopPiece("Black");
//        Piece WBishop = new BishopPiece("White");
//        Piece BKnight = new KnightPiece("Black");
//        Piece WKnight = new KnightPiece("White");
//        Piece BRook = new RookPiece("Black");
//        Piece WRook = new RookPiece("White");
//        Piece BPawn = new PawnPiece("Black");
//        Piece WPawn = new PawnPiece("White");
//
//
//
//
//
//		block[4][0].setPiece(BKing);
//		block[3][0].setPiece(BQueen);
//        block[5][0].setPiece(BBishop);
//        block[2][0].setPiece(BBishop);
//
//        block[6][0].setPiece(BKnight);
//        block[1][0].setPiece(BKnight);
//
//        block[7][0].setPiece(BRook);
//        block[0][0].setPiece(BRook);
//
//	        for(int i = 0 ; i < 8 ; i++){
//	            block[i][1].setPiece(BPawn);
//	        }
//
//        block[3][7].setPiece(WKing);
//
//        block[4][7].setPiece(WQueen);
//
//        block[5][7].setPiece(WBishop);
//        block[2][7].setPiece(WBishop);
//
//        block[6][7].setPiece(WKnight);
//        block[1][7].setPiece(WKnight);;
//
//        block[7][7].setPiece(WRook);;
//        block[0][7].setPiece(WRook);;
//	        for(int i = 0 ; i < 8 ; i++){
//	            block[i][6].setPiece(WPawn);
//	        }
//    }
//    public void resetBoard(){
//        this.whiteTeam = new Team("White");
//        this.blackTeam = new Team("Black");
//    }
//
//    public Team getBlackTeam(){
//        return blackTeam;
//    }
//
//    public Team getWhiteTeam(){
//        return whiteTeam;
//    }
//
//}