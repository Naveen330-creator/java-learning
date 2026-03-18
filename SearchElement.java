import java.util.Scanner;

public class SearchElement {
    public static void main(String args[]) {
        System.out.println("Enter the value of x ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                System.out.println(i);
                System.exit(0);
            }

        }
        System.out.println("Element Not Found ");
    }

}
