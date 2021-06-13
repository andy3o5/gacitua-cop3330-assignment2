package Exercise38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

 import java.util.ArrayList;
 import java.util.regex.Pattern;

 public class NumberFilter
 {

     public static ArrayList<Integer> filterEvenNumbers(int[] numberList)
     {
         ArrayList<Integer> evenNumbers = new ArrayList<>();

         for(int number: numberList)
         {
             if (number % 2 == 0)
             {
                 evenNumbers.add(number);
             }
         }
         return evenNumbers;
     }

     public static int[] convertToArray(String numbers)
     {
         String[] strNumberList = numbers.split(" ");

         int[] numberList = new int[strNumberList.length];
         for (int i = 0; i < numberList.length; i++)
         {
             if (isNumeric(strNumberList[i]))
             {
                 numberList[i] = Integer.parseInt(strNumberList[i]);
             }
             else
             {
                 throw new NumberFormatException("Your list contains non-numeric characters.");
             }
         }
         return numberList;
     }

     private static boolean isNumeric(String strNumber)
     {
         return  Pattern.matches("^[0-9]+$", strNumber );
     }
 }