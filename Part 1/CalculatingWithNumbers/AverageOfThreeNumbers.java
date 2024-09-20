package CalculatingWithNumbers;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give the first number: ");
            int first = Integer.valueOf(input.nextLine());
        System.out.println("Give the second number: ");
            int second = Integer.valueOf(input.nextLine());
         System.out.println("Give the second number: ");
            int third = Integer.valueOf(input.nextLine());

        double average = (double) (first + second + third)/3;
        System.out.println("The average is: " + average);
    }
}
