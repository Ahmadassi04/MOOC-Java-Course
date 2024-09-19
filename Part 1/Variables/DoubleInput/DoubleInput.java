package Variables.DoubleInput;
import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        double value = Double.valueOf(input.nextLine());
        System.out.println("You gave the number " + value);
    }
    
}
