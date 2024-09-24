package Part2.RepeatingFunctionality;

import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String carry = input.nextLine();
            if(carry.equals("no")){
                break;
            }
        }
    }
}
