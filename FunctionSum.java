import java.util.Scanner;

public class FunctionSum {
    public static void Sum(int a, int b) {
        int add;
        add = a + b;
        System.out.println(add);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int add;
        Sum(a, b);
        sc.close();

    }

}
