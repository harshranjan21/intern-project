import java.util.Random;
import java.util.Scanner;

class GamePlay extends scoreBoard
{
    int overs;
    int wicketsPlayer1;
    int runsPlayer1;
    int wicketsPlayer2;
    int runsPlayer2;
    int target=1000;
    int AvailableWickets=3;
    public GamePlay(int overs, int wicketsPlayer1, int runsPlayer1,int wicketsPlayer2,int runsPlayer2)
    {
        this.overs = overs;
        this.wicketsPlayer1 = wicketsPlayer1;
        this.runsPlayer1 = runsPlayer1;
        this.wicketsPlayer2 = wicketsPlayer2;
        this.runsPlayer2= runsPlayer2;
    }
    void gamePlay()
    {
        Innings First=new Innings(target,overs,0,AvailableWickets,1);
        First.Start();
        System.out.println(First.Runs+ " BUG");
        target=First.Runs+1;
        Innings Second=new Innings(target,overs,0,AvailableWickets,2);
        Second.Start();
        scoreBoard.winStatus(First.Runs,Second.Runs,Second.Wickets,AvailableWickets);

    }
}