import java.util.Random;
import java.util.Scanner;




public class CricketGame {
    public static void main(String[] args) {



        // TODO Auto-generated method stub
        int overs =1, userInput;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("press '1' to PLAY and '0' to QUIT\n");
            userInput = input.nextInt();
            switch(userInput)
            {
                case 0:
                    break;
                case 1:
                    GamePlay game = new GamePlay(2,3,0,3,0);
                    game.gamePlay();
                    break;
                default:
                    System.out.println("HIT the VALID Key!!!");
            }
        } while(userInput != 0);

        System.out.println("EXIT Successfully");
    }

}