// Write a program that prints five uniform random numbers between 0 and 1, their average value, and their minimum and maximum values. 
// Use Math.random(), Math.min(), and Math.max().

public class FiveRandomNumbers {
  public static void main(String[] args) {
    double num1 = Math.random();
    double num2 = Math.random();
    double num3 = Math.random();
    double num4 = Math.random();
    double num5 = Math.random();

    //Print the 5 random numbers
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);

    // Calculate the sum
    double sum = num1 + num2 + num3 + num4 + num5;

    // Calculate the average value
    double avg = sum / 5;

    // Calculate the minimum and maximum values

    double min1 = Math.min(num1, num2);
    double min2 = Math.min(num3, num4);
    double min3 = Math.min(min1, min2);
    double minimum = Math.min(min3, num5);

    double max1 = Math.max(num1, num2);
    double max2 = Math.max(num3, num4);
    double max3 = Math.max(max1, max2);
    double maximum = Math.max(max3, num5);

    // Print everything out
    System.out.println("Average: " + avg);
    System.out.println("Minimum: " + minimum);
    System.out.println("Maximum: " + maximum);

  }
}