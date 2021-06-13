package Exercise30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

public class MultiplicationTablesGenerator
{

    private static void printTables()
    {

        System.out.print("  ");

        for(int c = 1; c <= 12; c++)
        {

            System.out.printf ("%5s",c);
        }

        System.out.println();

        for (int i = 1; i <= 12; i++)
        {
            System.out.printf ("%2d", i);

            for(int j = 1; j <= 12; j++)
            {
                System.out.printf ("%5d", i * j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        MultiplicationTablesGenerator.printTables();
    }
}