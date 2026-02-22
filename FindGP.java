import java.util.Scanner;

public class FindGP {
    public static void main(String args[]) {
        System.out.println("Enter gp is ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n, a, r ");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + ",");
            term = term * r;

        }
    }

}
