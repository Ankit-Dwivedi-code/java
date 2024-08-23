import java.util.Scanner;

class Ques2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = in.nextDouble();
        float pi = 3.14f;
        System.out.println("Circumference is  " + 2*pi*r);
        System.out.println("Area is " + pi * r * r);
        in.close();
    }
}
