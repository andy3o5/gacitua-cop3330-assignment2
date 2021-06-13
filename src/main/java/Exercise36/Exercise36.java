package Exercise36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

 import java.util.Collections;
 import java.util.ArrayList;

 public class StatisticsCalculator
 {

     public double calculateAverage(ArrayList<Double> list)
     {
         checkNumberOfElements(list);

         double sum = getSum(list);
         return sum / list.size();
     }

     public double calculateMaximum(ArrayList<Double> list)
     {
         checkNumberOfElements(list);
         return Collections.max(list);
     }

     public double calculateMinimum(ArrayList<Double> list)
     {
         checkNumberOfElements(list);
         return Collections.min(list);
     }

     public double calculateSampleStandardDeviation(ArrayList<Double> list)
     {
         double average = calculateAverage(list);

         ArrayList<Double> squaredDiffs = new ArrayList<>();
         for (double number : list)
         {
             double diff = Math.pow(number - average, 2);
             squaredDiffs.add(diff);
         }

         double averageOfSquaredDiffs = getSum(squaredDiffs) / (squaredDiffs.size() - 1);
         return Math.ceil(Math.sqrt(averageOfSquaredDiffs) * 100) / 100 ;
     }

     private void checkNumberOfElements(ArrayList<Double> list)
     {
         if (list.isEmpty() || list.size() < 2)
         {
             throw new IllegalArgumentException("You need to enter two or more values.");
         }
     }

     private double getSum(ArrayList<Double> list)
     {
         double sum = 0;
         for (double number : list)
         {
             sum += number;
         }
         return sum;
     }
 }