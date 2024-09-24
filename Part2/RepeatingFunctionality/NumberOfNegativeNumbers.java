package Part2.RepeatingFunctionality;

import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        while(true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(input.nextLine());

            if (number == 0) {
                break;
            }
            else if (number < 0) {
                count = count + 1;
            }
        }
        System.out.println("Number of numbers: " + count);
    }
}
