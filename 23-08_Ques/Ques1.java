import java.util.Scanner;

/**
 * 01_solution
 */

 class Ques1
 {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");;
        int x = in.nextInt();
        System.out.println("Enter another number");;
        int y = in.nextInt();
        System.out.println("Before exchange x = " + x + " and y = " + y);
        int t;
        t = x;
        x = y;
        y = t;
        System.out.println("After exchange x = " + x + " and y = " + y);
        in.close();
    }
 }