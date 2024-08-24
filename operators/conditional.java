import java.util.Scanner;

class conditional
{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x;
        System.out.println("Enter a number: ");
        x = in.nextInt();
        String result = (x % 2 ==0) ? "Number is even" : "Number is odd";

        System.out.println("Result : " + result);
    }
}