package ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string: ");
            String first = input.nextLine();
        System.out.println("Enter the second string: ");
            String second = input.nextLine();

        if(first.equals(second)){
            System.out.println("same");
        }else{
            System.out.println("Different");
        }
    }
}
