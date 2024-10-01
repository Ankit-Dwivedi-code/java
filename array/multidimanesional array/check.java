import java.util.Scanner;

/**
 * check
 */
class check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] x = new int[3][3];
        System.out.println("Enter a matrix of 3X3 order: ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " row data enter: ");
            for (int j = 0; j < 3; j++) {
                x[i][j] = in.nextInt();
            }
        }
        System.out.println("The matrix you have entered is: ");
        for (int a[] : x) {
            for (int b : a) {
                System.out.print("\t" + b);
            }
            System.out.println();
        }
        int determinant = x[0][0] * (x[1][1] * x[2][2] - x[1][2] * x[2][1])
                - x[0][1] * (x[1][0] * x[2][2] - x[1][2] * x[2][0]) + x[0][2] * (x[1][0] * x[2][1] - x[1][1] * x[2][0]);
        if (determinant == 0) {
            System.out.println("Matrix is singular.");
        } else {
            System.out.println("Matrix is not singular");
        }
    }

}