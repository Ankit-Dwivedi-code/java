import java.util.Scanner;

class nestedifelse
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if(5000 < num && num < 50000)
        {
            System.out.println("The entered number is between 50000 and 50000.");
            if (num == 25000) {
                System.out.println("Number is equal to 25000");
            }
            if (num == 35000)
            {
                System.out.println("Number is equal to 35000.");
            }
        }
        else
        {
            System.out.println("The entered number is not between 50000 and 500000");
        }
        if (num == 75000) {
            System.out.println("Number is equal to 75000");
        }
    }
}