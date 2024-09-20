package CalculatingWithNumbers;

import java.util.Scanner;

public class SecondsInDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(input.nextLine());
        int result = number * 86400;
        System.out.println(result);
    }
}
