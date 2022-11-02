import java.util.Random;
import java.util.Scanner;

 class Main {
     public static double getAverage(int values[])
     {
         int sum = 0;
         for (int x = 0; x < values.length; x++) {
             sum += values[x];
         }
         int average = sum / values.length;
         return average;
     }

     public static void main(String[] args) {
         Random rnd = new Random();
         Scanner in = new Scanner(System.in);

         int dataPoints[];
         int sum = 0;
         int userInput;
         int count = 0;
         int num = 0;
         int max = 0;

         dataPoints = new int[100];

         for (int x = 0; x < dataPoints.length; x++) {
             dataPoints[x] = rnd.nextInt(100) + 1;
             System.out.println(dataPoints[x]);
         }
         for (int x = 0; x < dataPoints.length; x++) {
             System.out.printf("%d | ", dataPoints[x]);
         }
         for (int x = 0; x < dataPoints.length; x++) {
             sum += dataPoints[x];
         }
         System.out.println("\nThe sum of the array is: " + sum);
         System.out.println("The average in this array is: " + sum / dataPoints.length);

         userInput = SafeInput.getRangedInt(in, "Enter your target number", 0, 100);

         for (int x = 0; x < dataPoints.length; x++) {
             if (dataPoints[x] == userInput) {
                 count++;
             }
         }
         System.out.println(userInput + " was found " + count + " times.");
         count = 0;
         System.out.print("Enter another target number: ");
         int target = in.nextInt();

         for (int i = 0; i < dataPoints.length; i++) {
             count++;
             if (dataPoints[i] == target) {
                 count = count - 1;
                 System.out.println("The value " + target + " was found at array index position " + count);
                 break;
             }
             else if (count == 100) {
                 System.out.println("That value was not found in the array");
             }
         }
         for(int i = 0; i < dataPoints.length; i++) {
             if(dataPoints[i] > max) {
                 max = dataPoints[i];
             }
         }
         int min = dataPoints[0];
         for(int i = 0; i < dataPoints.length; i++) {
             if(dataPoints[i] < min) {
                 min = dataPoints[i];
             }
         }
         System.out.println("The max value in this array is: " + max);
         System.out.println("The min value in this array is: " + min);
         System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
     }
 }