import java.util.Scanner;

public class PracticeAll {
    public static void main(String args[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;

        int rev = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = (rev * 10) + r;
        }
        System.out.println(rev);
        sc.close();

    }

}
