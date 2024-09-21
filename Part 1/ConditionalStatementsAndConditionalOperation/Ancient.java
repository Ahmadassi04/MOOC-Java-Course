package ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(input.nextLine());

        if(number < 2015){
            System.out.println("Ancient history!");
        }
    }
}
