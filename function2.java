import java.util.Scanner;

public class function2 {
    public static int Sum(int a, int b) {

        int sum;
        sum = a + b;
        System.out.println(sum);
        return 0;
    }

    public static void main(String args[]) {
        System.out.println("Enter a and b ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int sum;
        Sum(a, b);

    }

}
