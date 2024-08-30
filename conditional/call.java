import java.util.Scanner;

class call {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        
        System.out.println("Enter your total number of calls: ");
        int call = in.nextInt();
        
        double bill = 0.0;

        if (call <= 50) {
            bill = 0.0;  
        }
        else if (call > 50 && call <= 150)
        {
            bill = (call - 50) * 0.5;
        }
        else if(call > 150 && call <= 250)
        {
            bill = 100 * 0.5 + (call - 150) * 1;
        }
        else if (call > 250) {
            bill = 100 * 0.5 + 100 * 1 + (call - 250) * 1.5;
            if (call > 500 && call < 700) {
                bill = bill + (call - 449) * 2;
            }
        }
        System.out.println("Customer name" + name);
        System.out.println("Total number of call: " + call);
        System.out.println("Total bill: " + bill);
        in.close();
    }
}