import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String arg[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int rev = 0;
        int count = n;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = (rev * 10) + r;
        }
        if (count == rev)
            System.out.println("Number is Palindrome ");
        else
            System.out.println("Number is not Palindrome ");

    }

}
