package Variables.BooleanInput;

import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Write something: ");
        boolean value = Boolean.valueOf(input.nextLine());
        System.out.println("True or False? " + value);
    }
    
}
