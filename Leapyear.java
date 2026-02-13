import java.util.Scanner;
//import java.lang.*;

public class Leapyear {
    public static void main(String args[]) {
        int num;
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 4 == 0) {
            System.out.println("Num is leap year ");
        } else if ((num % 100 == 0) && (num % 400 == 0)) {
            System.out.println("num is not leap year ");

        } else {
            System.out.println("num is not leap year ");
        }

    }

}
