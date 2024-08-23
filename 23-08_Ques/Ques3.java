import java.util.Scanner;

class Ques3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = in.nextInt();
        System.out.println("Enter breadth: ");
        int bre = in.nextInt();
        //Compute area and perimeter
        System.out.println("Area = " + (len * bre));
        System.out.println("Perimeter = " + 2 * (len + bre));
        in.close();
    }
}