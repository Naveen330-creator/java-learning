import java.util.Scanner;

public class multiplicationTable {
    public static void main(String args[]) {
        System.out.println("Enter a number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            // n = n * i;
            System.out.println(n + "*" + i + "=" + n * i);

        }
    }

}
