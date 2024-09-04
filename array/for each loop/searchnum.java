import java.util.Scanner;

/**
 * searchnum
 */
class searchnum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 integer values: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        //Take input and search how many times the number is in list
        System.out.println("Enter a integer value to be searched: ");
        int num = in.nextInt();
        int count = 0;
        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        System.out.println("Number exists: " + count + " times in list");
        in.close();
    }
}