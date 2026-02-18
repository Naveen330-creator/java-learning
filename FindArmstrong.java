import java.util.Scanner;

public class FindArmstrong {
    public static void main(String args[]) {
        System.out.println("Enetr a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int r;
        int sum = 0;
        int count = 0;
        while (n > 0) {
            r = n % 10;
            System.out.println(count++);
            sum = sum + (r * r * r);
            n = n / 10;
            // sum=sum+()
            // System.out.println(sum);

        }
        if (sum == temp) {
            System.out.println("Number is armstrong ");

        } else {
            System.out.println("Number is not armstrong ");
        }
    }

}
