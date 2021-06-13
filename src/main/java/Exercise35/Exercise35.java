package Exercise35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

 import java.util.ArrayList;
 import java.util.Random;

 public class PickAWinner
 {
     private ArrayList<String> contestants;

     public PickAWinner()
     {
         contestants = new ArrayList<>(10);
     }

     public void addContestant(String name)
     {
        if(! name.equals(""))
        {
             contestants.add(name);
        }
     }

     public String selectWinner()
     {
         if(contestants.isEmpty())
         {
             return "Sorry you haven\'t entered any contestants";
         }
         else if(contestants.size()== 1)
         {
             return "Of course you know the winner can only be " + contestants.get(0);
         }
         else
         {
             Random random = new Random();
             int randomNumber = random.nextInt(contestants.size());
             return contestants.get(randomNumber);
         }
     }
 }