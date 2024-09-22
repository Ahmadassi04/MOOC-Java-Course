package Part2.Recurring;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = Integer.valueOf(input.nextLine());
        int second = Integer.valueOf(input.nextLine());

        if(first > second){
            System.out.println(first + " is greater than " + second);
        }else if(first < second){
            System.out.println(first + " is smaller than " + second);
        }else{
            System.out.println(first + " is eqaul to " + second);
        }

    }
}
