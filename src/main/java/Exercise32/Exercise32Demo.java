package Exercise32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

import java.util.Scanner;

public class Exercise32Demo
{

    private Scanner s;
    private String result;
    private Exercise32.Level level;
    private Exercise32 gtn;

    public Exercise32rDemo()
    {
        s = new Scanner(System.in);
        result = "";
        createNewGame();
    }

    private void createNewGame()
    {
        System.out.print("Enter your level: 1 for Beginner, 2 for Intermediate, or  3 Advanced ");
        int number = s.nextInt();
        switch(number)
        {
            case 1:
                level = Exercise32.Level.Beginner;
                break;
            case 2:
                level = Exercise32.Level.Intermediate;
                break;
            case 3:
                level = Exercise32.Level.Advanced;
                break;
        }
        gtn =  new Exercise32(level);
    }

    private void askForGuess()
    {

        while (!result.equals("Equal"))
        {
            if (level == Exercise32.Level.Beginner)
                System.out.print("You must enter a number from 1 to 10: ");
            else if (level == Exercise32.Level.Intermediate)
                System.out.print("You must enter a number from 1 to 100: ");
            else
                System.out.print("You must enter a number from 1 to 1000: ");

            result = gtn.play(s.nextInt());

            if(result.equals("Equal"))
                printResultAndAskToPlayAgain();
            else
                System.out.println(result);
        }
    }

    private void printResultAndAskToPlayAgain()
    {

            System.out.println("You guessed the number in " + gtn.getNumberOfGuesses() + " attempts!");

            System.out.println("Would you like to play again? Enter Y or N.");
            if(s.next().equalsIgnoreCase("Y"))
            {
                Exercise32Demo gtnd = new Exercise32Demo();
                gtnd.askForGuess();
            }
    }

    public static void main(String[]args)
    {
        Exercise32Demo gtnd = new Exercise32Demo();
        gtnd.askForGuess();
    }
}