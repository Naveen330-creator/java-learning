import java.util.Scanner;

public class printno {
    public static void main(String args[]) {
        System.out.println("Printing no. to n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }
    }

}
