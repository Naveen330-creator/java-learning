import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for (int i = n; i > 0; i--) {
            // System.out.println(i);
            c = c * i;
        }
        System.out.println(c);

    }

}
