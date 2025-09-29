import java.util.Scanner;

public class UseRadix {
    public static void main(String args[]) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        sc.useRadix(16);
        int x = sc.nextInt();
        System.out.println(x);

    }

}
