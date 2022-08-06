package com.company;
import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        int sum = 0;
        int avg = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        System.out.println();
        System.out.println("The sum of the random datapoints array is: " + sum);
        avg = sum / dataPoints.length;
        System.out.println("The average of the random datapoints array is: " + avg);

        Scanner in = new Scanner(System.in);

        int value = SafeInput.getRangedInt(in, "Enter an int value between 1 and 100: ", 1, 100);
        int countFound = 0;
       for (int i = 0; i < dataPoints.length; i++) {
          if (dataPoints[i] == value) {
                countFound++;
           }
       }
        System.out.println("Your special value was found " + countFound + " time(s) in the random array!");
        boolean found = false;
        int firstValFound = SafeInput.getRangedInt(in, "Enter an int value between 1 and 100: ", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == firstValFound) {
                System.out.println("The first occurrence of the value " + dataPoints[i] + " was found at index " + i + ".");
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Your value " + firstValFound + " was not found in the array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) min = dataPoints[i];
            if (dataPoints[i] > max) max = dataPoints[i];
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        double[] testArray = {45.4, 24.2, 453.3, 466.2};
        System.out.println("Average of dataPoints is: " + getAverage(testArray));

    }


    public static double getAverage(double values[]) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return (sum / values.length);
    }


}