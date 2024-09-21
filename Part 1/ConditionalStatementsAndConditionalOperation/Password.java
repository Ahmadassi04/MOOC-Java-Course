package ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("password? ");
        String password = input.nextLine();

        if(password.equals("Caput Draconis")){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
