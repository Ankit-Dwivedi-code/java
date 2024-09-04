import java.util.Scanner;

/**
 * student
 */
class student {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ch = null;
        do {
            System.out.println("Enter your name: ");
            String name = in.nextLine();
            System.out.println("Enter roll no: ");
            int roll = in.nextInt();
            System.out.println("Enter marks: ");
            int makrs = in.nextInt();
            System.out.println("Name: " + name + "");
            System.out.println("Do you want to continue? (y/n): ");
            ch = in.nextLine();
        } while (ch == "y" || ch == "Y");
    }
    
}