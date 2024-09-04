import java.util.Scanner;


/**
 * number
 */
public class number {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int num;
        String x = in.nextLine();
        do {
            System.out.println("Enter a number: ");
            num = in.nextInt();
            System.out.println("Number is" + num);
        } while (num != 0);
    }
}