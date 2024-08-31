import java.util.Scanner;


/**
 * operator
 */
public class operator {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    float num1 = in.nextFloat();
    System.out.println("Enter second number: ");
    float num2 = in.nextFloat();
    // Consume the newline character left by nextFloat()
    in.nextLine();
    System.out.println("Enter an operator: ");
    String op = in.nextLine();
    switch (op) {
        case "+":
                System.out.println(num1 + num2);
                break;
        case "-":
                System.err.println(num1 - num2);
                break;
        case "*":
                System.err.println(num1 * num2);
                break;
        case "/":
                System.err.println(num1 / num2);
                break;
        case "%":
                System.err.println(num1 % num2);
                break;
        default:
                System.err.println("Invalid input!");
    }
}
    
}