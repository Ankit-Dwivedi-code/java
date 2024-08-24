import java.util.Scanner;

class ques
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number");
        int x =  in.nextInt();
        System.out.println("enter another number: ");
        int y = in.nextInt();
        System.out.println("Enter third number: ");
        int z = in.nextInt();
        int result = ((x < y && x < z ) ? x : y < z ? y : z);
        System.out.println("Smalest number is : " + result);
    }
}