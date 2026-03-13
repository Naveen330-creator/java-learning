import java.util.Scanner;

public class Armstrongno {
    public static void main(String arg[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int count = n;
        int sum = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + (r * r * r);

        }
        if (count == sum)
            System.out.println("No. is Arm");
        else
            System.out.println("Not arm. ");

    }

}
