import java.util.Scanner;

public class EvenOdd {
    public static int check(int n) {
        if ((n & 1) == 0)
            return 1;
        return 0;
    }

    public static void main(String args[]) {
        System.out.println("Enetr a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number is Even:" + (check(n) == 1));
        // System.out.println("Number is Prime:" + prime(n));
        sc.close();
    }

}
