package Part2.Recurring;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.valueOf(input.nextLine());
        int positive = number * -1;

        if(number > 0){
            System.out.println(number);
        }else{
            System.out.println(positive);
        }
    }
}
