import java.util.Scanner;

/**
 * sum
 */
class sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num[] = new float[10];
        System.err.println("Enter any 10 real numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = in.nextFloat();
        }

        for (float a : num) {
            System.out.println(a);
        }

        //Sum by using for each
        float totalSum = 0; 
        for (float f : num) {
            totalSum += f;  
        }

        System.err.println(totalSum);
        in.close();
    }
}