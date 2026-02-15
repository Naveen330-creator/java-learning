import java.util.Scanner;

public class FindFactor {
    public static void main(String args[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();
        int i;
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                // i++;
                System.out.println(i);
            }
            // System.err.println(i);
        }
    }
}
