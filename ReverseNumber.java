import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int rev;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = (r * 10) + r;
            System.out.println(rev);

        }
        // System.out.println(r);

    }

}
