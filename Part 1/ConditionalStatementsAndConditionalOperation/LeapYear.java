package ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a year: ");
            int year = Integer.valueOf(input.nextLine());

            if (year % 400 == 0) {
                System.out.println(" The year is a leap year.");
            } else if (year % 100 == 0) {
                System.out.println("The year is not a leap year.");
            } else if (year % 4 == 0) {
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
    }
}
