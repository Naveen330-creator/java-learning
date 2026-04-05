import java.util.Scanner;

public class EO {
    public static void main(String args[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        for (int i = 9; i < 101; i++) {
            if ((i & 1) == 0) {
                System.out.println(i);

            }
        }
    }

}
