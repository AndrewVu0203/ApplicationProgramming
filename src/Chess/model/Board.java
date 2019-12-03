package Chess.model;

public class Board{

    public Board(Block block[][]){
        block[4][0].setPiece(new KingPiece("Black", 4, 0));
        block[3][0].setPiece(new QueenPiece("Black", 3, 0));

        block[5][0].setPiece(new BishopPiece("Black", 5, 0));
        block[2][0].setPiece(new BishopPiece("Black", 2, 0));

        block[6][0].setPiece(new KnightPiece("Black", 6, 0));
        block[1][0].setPiece(new KnightPiece("Black", 1, 0));

        block[7][0].setPiece(new RookPiece("Black", 7, 0));
        block[0][0].setPiece(new RookPiece("Black", 0, 0));

        for(int i = 0 ; i < 8 ; i++){
            block[i][1].setPiece(new PawnPiece("Black", i, 1));
        }

        block[4][7].setPiece(new KingPiece("White", 4, 7));
        block[3][7].setPiece(new QueenPiece("White", 3, 7));

        block[5][7].setPiece(new BishopPiece("White", 5, 7));
        block[2][7].setPiece(new BishopPiece("White", 2, 7));

        block[6][7].setPiece(new KnightPiece("White", 6, 7));
        block[1][7].setPiece(new KnightPiece("White", 1, 7));

        block[7][7].setPiece(new RookPiece("White", 7, 7));
        block[0][7].setPiece(new RookPiece("White", 0, 7));

        for(int i = 0 ; i < 8 ; i++){
            block[i][6].setPiece(new PawnPiece("White", i, 6));
        }
    }

}