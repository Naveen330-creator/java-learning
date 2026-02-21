import java.util.Scanner;

public class Fact2 {
    public static void main(String args[]) {
        System.out.println("Enter a Number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;

        }
        System.out.println(fact);
    }

}
