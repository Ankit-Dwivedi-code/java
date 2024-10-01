import java.util.Scanner;

class prime {
    Scanner in = new Scanner(System.in);
    int a;
    int flag = 0;
    void input()
    {
        System.out.println("Enter a number: ");
        a = in.nextInt();
    }

    void is_prime()
    {
        if (a < 2) {
            flag = 0;
        }
        for (int i = 2; i < a/2; i++) {
            if (a % i == 0) {
                flag = 1;
                 break;
            }
        }
        if (flag == 0) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
