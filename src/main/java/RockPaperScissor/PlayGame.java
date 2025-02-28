package RockPaperScissor;

import java.util.Scanner;

public class PlayGame {
    public static int checkChoice(int choice1, int choice2) {
        switch(choice1) {
            case 1:
                if(choice2 == 1) return 0;
                else if(choice2 == 2) return 2;
                else return 1;

            case 2:
                if(choice2 == 1) return 1;
                else if(choice2 == 2) return 0;
                else return 2;

            case 3:
                if(choice2 == 1) return 2;
                else if(choice2 == 2) return 1;
                else return 0;

            default:
                return -1;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Player1 Name");
        String player_1 = scan.nextLine();
        System.out.println("Please enter Player2 Name");
        String player_2 = scan.nextLine();

        int count1 = 0, count2 = 0;
        while(true) {

            System.out.println("Please choose ur Selection " + player_1 + "\n 1. ROCK\n 2. Paper\n 3. SCISSOR");
            int choice1 = scan.nextInt();
            System.out.println("Please choose ur Selection " + player_2 + "\n 1. ROCK\n 2. Paper\n 3. SCISSOR");
            int choice2 = scan.nextInt();

            int result = checkChoice(choice1, choice2);
            if( result == 1) {
                if(count2 != 0)
                    count2 = 0;
                count1 +=1;

                System.out.println(player_1 + "won this match! \n common`" + player_2 + " focuss**");
            }
            if( result == 2) {
                if(count1 != 0)
                    count1 = 0;
                count2 +=1;
                System.out.println(player_2 + "won this match! \n common`" + player_1 + " focuss**");
            }
            if(result == 0) {
                count1 = 0;
                count2 = 0;
                System.out.println("Try hard assholes.. both gave same choices..");
            }

            if(count1 == 3 && count2 ==0) {
                System.out.println("PLayer 1 " + player_1 +" has won the Game!!!! ");
                break;
            }
            if(count2 == 3 && count1 ==0) {
                System.out.println("PLayer 2 " + player_2 +" has won the Game!!!! ");
                break;
            }


        }
    }
}
