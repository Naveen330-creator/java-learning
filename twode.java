import java.util.Scanner;

public class twode {
    public static void main(String args[]) {
        System.out.println("Enter rows and column ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int A[][] = new int[rows][col];
        // int B[][] = new int[rows][col];
        // int C[][] = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
