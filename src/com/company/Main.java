package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rn = new Random();
        int randomNum = rn.nextInt(6) + 5;
        double[] myList = new double[randomNum];
        System.out.println( "Random number of array elements is " + randomNum);

        Random r = new Random();
        System.out.println( "Random array elements is :-");
        for (int i = 0; i < myList.length; i++) {
            double random = (r.nextInt(451) + 450) / 10.0;
            myList[i] = random;
            System.out.println(myList[i] + " ");
        }
        //get average
        average(myList);

        //type the largest number
        maximumValue(myList);

        //The difference between The second largest number and the second smallest number
        getDifference(myList, myList.length);
    }

    private static void getDifference(double[] myList, int total) {
        Arrays.sort(myList);
//        "The second largest number is: " + myList[total - 2]
//        "The second smallest number is: " + myList[1]
        double x = myList[total - 2] - myList[1];
        System.out.println("The difference between The second largest number and the second smallest number is: " + x);
    }

    private static void maximumValue(double[] myList) {
        double max = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }

        System.out.println("The Largest number is: " + max);
    }

    private static void average(double[] myList) {
        double sum = 0;
        double av;

        for (int i = 0; i < myList.length; i++) {
            sum = sum + myList[i];
        }
        av =  sum / myList.length;
        System.out.println("Average value of array element is " + av);
    }

}
