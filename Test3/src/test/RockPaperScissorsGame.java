package test;

import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        int round = 0;
        int myNumber = 0;
        int numberWin = 0;
        int numberLost = 0;
        String randomRock = "";
        while(numberWin <= 2 && numberLost <=2) {
            round++;
            int randomNumber = (int)(1 + Math.random() * 3);
            System.out.print("Please enter scissors rock or paper:");
            Scanner input = new Scanner(System.in);
            String myRock = input.next();
            switch (myRock) {
                case "scissors": myNumber = 1; break;
                case "rock": myNumber = 2; break;
                case "paper": myNumber = 3; break;
            }
            switch (randomNumber) {
                case 1: randomRock = "scissors"; break;
                case 2: randomRock = "rock"; break;
                case 3: randomRock = "paper"; break;
            }
            System.out.println("Round" + round);
            if (myNumber == randomNumber) {
                System.out.println("Draw! The compute is " + myRock
                        + " too. " + "win:"+numberWin+",lost:"+numberLost);
            } else if (myNumber == 1 && randomNumber == 3 ||
                    myNumber == 2 && randomNumber == 1 || myNumber == 3 && randomNumber == 2) {
                numberWin++;
                System.out.println("You win the round! The compute is " +
                        randomRock + ".  win:"+numberWin+",lost:"+numberLost);
            } else {
                numberLost++;
                System.out.println("You lost! The compute is " +
                        randomRock + ".  win:"+numberWin+",lost:"+numberLost);
            }
        }
    }
}
