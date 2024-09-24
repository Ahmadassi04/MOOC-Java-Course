package Part2.RepeatingFunctionality;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(input.nextLine());

            if (number == 0) {
                break;
            }
            else if (number == number) {
                count = count + 1;
                sum = sum + number;
            }
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
