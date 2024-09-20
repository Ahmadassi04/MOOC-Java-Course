package CalculatingWithNumbers;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Give the first number: ");
            int first = Integer.valueOf(input.nextLine());
        System.out.println("Give the second number: ");
            int second = Integer.valueOf(input.nextLine());
         System.out.println("Give the third number: ");
            int third = Integer.valueOf(input.nextLine());

        int sum = first + second + third;
        System.out.println("The sum of the numbers is: " + sum);
    }
}
