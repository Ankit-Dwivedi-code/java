import java.util.Scanner;

/**
 * Ques4
 */
class Ques4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = in.nextInt();
        System.out.println("Enter another number: ");
        int num2 = in.nextInt();
        System.out.println("Addition of number is: " + (num1 + num2));
        System.err.println("Subtraction of number is: " + (num1 - num2));
        System.out.println("Multiplication of number is: " + (num1 * num2));
        System.out.println("Division of number is: " + (num1 / num2));
        in.close();
    }
}