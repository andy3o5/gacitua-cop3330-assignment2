package Exercise29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

 import java.util.Scanner;
 public class Main
 {
         public static void main(String[] args)
         {
                 Scanner sc = new Scanner(System.in);
                 double r;
                 while(true)
                 {
                         try
                         {
                                 System.out.print("What is the rate of return? ");
                                 String str = sc.next();
                                 r = Double.parseDouble(str);
                                 if(r == 0)
                                         throw new Exception();
                                 break;
                         }
                         catch(Exception e)
                         {
                                 System.out.println("Sorry. That's not a valid input.");
                         }
                 }
                 int years = (int)(72/r);
                 System.out.println("It will take "+years+" years to double your initial investment.");
         }
 }