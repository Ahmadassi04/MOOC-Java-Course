package Variables.DifferentTypesOfInput;

import java.util.Scanner;

public class DifferentTypesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a string: ");
        String value = input.nextLine(); 

        System.out.println("Give a integer: ");
        int value1 = Integer.valueOf(input.nextLine()); 

        System.out.println("Give a double: ");
        double value2 = Double.valueOf(input.nextLine());  

        System.out.println("Give a boolean: ");
        boolean value3 = Boolean.valueOf(input.nextLine());  

        System.out.println("You gave the string " + value);
        System.out.println("You gave the integer " + value1);
        System.out.println("You gave the double " + value2);
        System.out.println("You gave the boolean " + value3);
    }
    
}
