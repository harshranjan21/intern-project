import java.util.Random;
import java.util.Scanner;
public class Innings extends scoreBoard{

    int Balls;
    int Runs;
    int Wickets;
    int Overs;
    int Target;
    Random rand = new Random();
    //Scanner input = new Scanner(System.in);
    int hit = 0;
    int InningsId;
    int BowlingId;


    public  Innings(int Target, int Overs, int Runs, int Wickets,int InningsId) {
        this.Overs = Overs;
        Balls = Overs * 6;
        this.Runs = Runs;
        this.Wickets = Wickets;
        this.Target = Target;
        this.InningsId = InningsId;
        if (InningsId == 1)
            BowlingId = 2;
        else BowlingId = 1;
    }

    public void Start(){
        System.out.println("\nPlayer "+InningsId+" is Batting, Player "+ BowlingId+" is Bowling\n");
        while ((Wickets > 0 && Balls > 0)){
                Balls--;
                hit = rand.nextInt(8);
                if (hit == 7) {
                    System.out.println("Ooops, OUT");
                    Wickets--;
                } else if (hit == 4) {
                    System.out.println(hit + " runs\nStraight 4 RUNS, HURRAY BOUNDARY!!!\n");
                    Runs = Runs + hit;
                } else if (hit == 6) {
                    System.out.println(hit + " runs\nIt's a SIXER, HURRAY!!!\n");
                    Runs = Runs + hit;
                } else {
                    System.out.println(hit + " runs");
                    Runs = Runs + hit;
                }
                System.out.println(Runs+" "+Wickets+" "+InningsId+" "+" "+Target);
            if (Runs > Target)
                break;
            }

        }
    }

