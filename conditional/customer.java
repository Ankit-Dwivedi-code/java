import java.util.Scanner;

class customer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        
        System.out.println("Enter your total number of calls: ");
        int call = in.nextInt();
        
        double bill = 0.0;

        // First 50 calls are free
        if (call <= 50) {
            System.out.println("You have nothing to pay!");
        } else {
            call -= 50;  // Subtract first 50 free calls
            
            // Next 100 calls @ Rs 0.50 each
            if (call > 100) {
                bill += 100 * 0.50;
                call -= 100;
            } else {
                bill += call * 0.50;  // If less than 100 calls after the first 50
                call = 0;
            }
            
            // Next 100 calls @ Rs 1.00 each
            if (call > 100) {
                bill += 100 * 1.00;
                call -= 100;
            } else if (call > 0) {
                bill += call * 1.00;
                call = 0;
            }
            
            // Calls above 250, but less than or equal to 500 @ Rs 1.50 each
            if (call > 0 && call <= 250) {
                bill += call * 1.50;
                call = 0;
            }
            
            // Calls between 500 and 700 @ Rs 2.00 each
            if (call > 0 && call <= 200) {
                bill += call * 2.00;
            }
        }

        System.out.println("\nCustomer Name: " + name);
        System.out.println("Total Bill: Rs " + bill);

        in.close();
    }
}
