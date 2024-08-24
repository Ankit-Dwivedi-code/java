import java.util.Scanner;

class ques2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final float pi = 3.14f;
        // pi = 4.32f; Cannot assign to the final variable pi;
        System.out.println("Enter radius: ");
        float r = in.nextFloat();
        double area = r < 0 ? 0 : (pi * r* r);
        System.out.println("area is " + area);
    }
}