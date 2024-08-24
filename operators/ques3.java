import java.util.Scanner;

class ques3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal Amount: ");
        float pr = in.nextFloat();
        System.out.println("Enter rate of interest: ");
        float rate = in.nextFloat();
        System.out.println("Enter  time");
        float time = in.nextFloat();

        String result = (pr > 0 && rate > 0 && time > 0) ? "Simple Interest :"+((pr*rate*time)/100) : "Invalid Input";

        System.out.println(result);
    }
}