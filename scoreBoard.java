public class scoreBoard {

    void scoreBoard(int runs, int wickets, int overs)
    {
        System.out.println("Score is:\n"
                +"Runs: "+runs+"\n"
                +"Wickets: "+wickets+"\n"
                +"Overs: "+(overs/6)+"."+(overs%6)+"\n");
    }
    static void winStatus(int runsPlayer1, int runsPlayer2,int Wickets,int TotalWickets)
    {
        if (runsPlayer1 > runsPlayer2 )
        {
            System.out.println("\nPlayer 1 wins by "+ (runsPlayer1 - runsPlayer2)+" runs\n" );
        }
        else if (runsPlayer2 > runsPlayer1 )
        {
            System.out.println("\nPlayer 2 wins by "+ (TotalWickets - Wickets)+" wickets\n" );
        }
        else if (runsPlayer1 == runsPlayer2 )
        {
            System.out.println("\n It's a DRAW\n" );
        }
    }
}
