package Exercise26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
   public static void main (String[] args) throws java.lang.Exception
   {
       Scanner sc=new Scanner(System.in);

       System.out.print("What is your balance? ");
       double b;
       b = sc.nextDouble();
       System.out.println(b);

       System.out.print("What is the APR on the card (as a percent)? ");

       double i;
       i = sc.nextDouble();
       System.out.println(i);

       i = (i/365);

       System.out.print("What is the monthly payment you can make?");
       double p;
       p = sc.nextDouble();
       System.out.println(p);

       double result;
       double power = Math.pow((i+i),30);
       result = -(1) * (Math.log(1+((b*(1-power))/p)));

       result = result / 30;
       result = result / (Math.log(1+i));
       result = -(result);

       System.out.println("It will take you" + Math.round(result) + "months to pay off this card.");
   }
}