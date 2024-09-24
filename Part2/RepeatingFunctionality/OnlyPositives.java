package Part2.RepeatingFunctionality;

import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(input.nextLine());

            if(number > 0){
               int sqrt = number * number;
               System.out.println(sqrt);
               continue;
            }
            else if(number == 0){
                break;
            }
            else{
                System.out.println("Unsuitable number");
                continue;
            }
        }
    }
}
