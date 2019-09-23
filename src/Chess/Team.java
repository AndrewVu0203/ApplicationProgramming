package Chess;

public class Team {
    String name;
    Piece[][] pieces;

    public Team(String name){
        this.name = name;
        this.pieces = setupTeam(name);;

    }

    private Piece[][] setupTeam(String team){
        Piece[][] arr = new Piece[8][2];
        // Array[8][2] = {{R,Kn,B,K,Q,B,Kn,R},{P,P,P,P,P,P,P,P}}
        Piece rook1 = new RookPiece(team);
        Piece knight1 = new KnightPiece(team);
        Piece bishop1 = new BishopPiece(team);
        Piece king = new KingPiece(team);
        Piece queen = new QueenPiece(team);
        Piece bishop2 = new BishopPiece(team);
        Piece knight2 = new KnightPiece(team);
        Piece rook2 = new RookPiece(team);
        arr[0][0] = rook1;
        arr[1][0] = knight1;
        arr[2][0] = bishop1;
        arr[3][0] = king;
        arr[4][0] = queen;
        arr[5][0] = bishop2;
        arr[6][0] = knight2;
        arr[7][0] = rook2;
        Piece pawn;
        for(int i = 0; i < 8; i++){
            pawn = new PawnPiece(team);
            arr[i][1] = bishop1;
        }
        return arr;
    }

    public String getTeamName(){
        return name;
    }

    public void clearTeam(){
        this.pieces = null;
    }

    public void removePiece(Piece piece){

    }

    public void addPiece(Piece piece){
    }

    public Piece[][] getPieces(){
        return this.pieces;
    }
}