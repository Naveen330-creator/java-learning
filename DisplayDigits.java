import java.util.Scanner;

public class DisplayDigits {
    public static void main(String args[]) {
        System.err.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        while (n > 0) {

            r = n % 10;
            n = n / 10;
            System.out.println(r);
        }
        // System.out.println(r);
    }

}
