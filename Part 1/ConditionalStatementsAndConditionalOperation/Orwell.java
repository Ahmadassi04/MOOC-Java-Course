package ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(input.nextLine());

        if(number == 1984){
            System.out.println("Orwell");
        }
    }
    }

