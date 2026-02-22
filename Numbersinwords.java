import java.util.*;

public class Numbersinwords {
    public static void main(String args[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        String str = "";

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            str = str + r;

            // System.out.println(rev);
        }
        System.out.println(str);

    }

}
