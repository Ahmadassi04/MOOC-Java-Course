package Part2.Recurring;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1 = Double.valueOf(input.nextLine());
        double number2 = Double.valueOf(input.nextLine());

        double sum = number1 + number2;
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}
