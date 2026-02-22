import java.util.Scanner;

public class FindAP {
    public static void main(String args[]) {
        System.out.println("Enyer no. of terms ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n, a, d ");

        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + ",");
            term = term + d;

        }
        // System.out.println(n);

    }

}
