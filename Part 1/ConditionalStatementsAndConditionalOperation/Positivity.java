package ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(input.nextLine());

        if(number > 0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is not positive.");
        }
    }
}
