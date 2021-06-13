package Exercise33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

import java.util.Random;

public class Magic8Ball
{
    private final static String[] responses = { "Yes", "No", "Maybe", "Ask again later"};

    public static String turnTheBall()
    {
        Random random = new Random();
        int indexSelected = random.nextInt(4); //should return a number from 0 to 3
        return responses[indexSelected];
    }
}