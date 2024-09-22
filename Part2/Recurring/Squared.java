package Part2.Recurring;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.valueOf(input.nextLine());
        int squared = number * number;

        System.out.println(squared);

    }
}
