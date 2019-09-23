package Chess;

public class Board{
    Team whiteTeam;
    Team blackTeam;

    public Board(){
        this.whiteTeam = new Team("White");
        this.blackTeam = new Team("Black");
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