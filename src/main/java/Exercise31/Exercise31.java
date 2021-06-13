package Exercise31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */
import java.util.HashMap;

public class HeartRateCalculator
{

    public static HashMap<Integer,Integer> calculate(int age, int restingHeartRate)
    {

        if(restingHeartRate <= 0)
        {
            throw new IllegalArgumentException("If your heart rate is 0 or less, you're dead!");
        }

        if(age < 0)
        {
            throw new IllegalArgumentException("You can't be less than 0 years!");
        }

        HashMap<Integer,Integer> targetHeartRates = new HashMap<>();

        for(int intensity = 55; intensity <= 95; intensity += 5)
        {
            int target = (((220-age)-restingHeartRate) * intensity/100)  + restingHeartRate;
            targetHeartRates.put(intensity, target);
        }

        return targetHeartRates;
    }
}