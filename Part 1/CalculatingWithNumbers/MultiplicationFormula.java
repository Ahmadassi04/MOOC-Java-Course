package CalculatingWithNumbers;

import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give the first number: ");
            int first = Integer.valueOf(input.nextLine());
        System.out.println("Give the second number: ");
            int second = Integer.valueOf(input.nextLine());

        int multiplication = first * second;
        System.out.println(first + " * " + second + " = " + multiplication);
    }
}

