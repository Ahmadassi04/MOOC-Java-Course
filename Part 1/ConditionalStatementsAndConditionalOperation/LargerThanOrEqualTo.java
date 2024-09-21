package ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int number1 = Integer.valueOf(input.nextLine());

        System.out.println("Give the second number: ");
        int number2 = Integer.valueOf(input.nextLine());

        if(number1 > number2){
            System.out.println("Greater number is: " + number1);
        }else if(number2 > number1){
            System.out.println("Greater number is: " + number2);
        }
        else{
            System.out.println("The two numbers are equal");
        }
    }
}
