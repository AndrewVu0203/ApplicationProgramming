package Chess.model;

public class Board{
    Team whiteTeam;
    Team blackTeam;

    public Board(Block block[][]){
        Piece BKing = new KingPiece("Black");
        block[4][0].setPiece(BKing);
        block[3][0].setPiece(new Piece(Piece.PieceType.Queen, "Black"));

        block[5][0].setPiece(new Piece(Piece.PieceType.Bishop, "Black"));
        block[2][0].setPiece(new Piece(Piece.PieceType.Bishop, "Black"));

        block[6][0].setPiece(new Piece(Piece.PieceType.Knight, "Black"));
        block[1][0].setPiece(new Piece(Piece.PieceType.Knight, "Black"));

        block[7][0].setPiece(new Piece(Piece.PieceType.Rook, "Black"));
        block[0][0].setPiece(new Piece(Piece.PieceType.Rook, "Black"));

        for(int i = 0 ; i < 8 ; i++){
            block[i][1].setPiece(new Piece(Piece.PieceType.Pawn, "Black"));
        }

        block[3][7].setPiece(new Piece(Piece.PieceType.King, "White"));

        block[4][7].setPiece(new Piece(Piece.PieceType.Queen, "White"));

        block[5][7].setPiece(new Piece(Piece.PieceType.Bishop, "White"));
        block[2][7].setPiece(new Piece(Piece.PieceType.Bishop, "White"));

        block[6][7].setPiece(new Piece(Piece.PieceType.Knight, "White"));
        block[1][7].setPiece(new Piece(Piece.PieceType.Knight, "White"));

        block[7][7].setPiece(new Piece(Piece.PieceType.Rook, "White"));
        block[0][7].setPiece(new Piece(Piece.PieceType.Rook, "White"));

        for(int i = 0 ; i < 8 ; i++){
            block[i][6].setPiece(new Piece(Piece.PieceType.Pawn, "White"));
        }
    }

    public void resetBoard(){
        this.whiteTeam = new Team("White");
        this.blackTeam = new Team("Black");
    }

    public Team getBlackTeam(){
        return blackTeam;
    }

    public Team getWhiteTeam(){
        return whiteTeam;
    }

}