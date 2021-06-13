package Exercise32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

import java.util.Random;

public class GuessTheNumber
{

    private Random random;
    private Level selectedLevel;
    private int randomNumber;
    private int numberOfGuesses;

    enum Level
    {
        Beginner,Intermediate,Advanced
    }

    public GuessTheNumber(Level level)
    {
        random = new Random();
        selectedLevel = level;
        randomNumber = generateRandomNumber();
        numberOfGuesses = 0;
    }

     GuessTheNumber(Level level, long seed)
     {
        random = new Random(seed);
        selectedLevel = level;
        randomNumber = generateRandomNumber();
        numberOfGuesses = 0;
    }

    private int generateRandomNumber()
    {
        if(selectedLevel == Level.Beginner)
            return random.nextInt(10) + 1;
        else if(selectedLevel == Level.Intermediate)
            return random.nextInt(100) + 1;
        else
            return random.nextInt(1000) + 1;
        }

    public String play(int guess)
    {

            numberOfGuesses++;

            if (guess < randomNumber)
                return "Too Low";
            else if (guess > randomNumber)
                return "Too High";
            else
                return "Equal";
    }

    public int getNumberOfGuesses()
    {
        return numberOfGuesses;
    }

    public int getRandomNumber()
    {
        return randomNumber;
    }
}