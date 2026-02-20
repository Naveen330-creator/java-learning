import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }

    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        
        // 1. Calculate number of digits
        int digits = String.valueOf(n).length();
        
        // 2. Extract digits and calculate sum of powers
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp = temp / 10;
        }
        
        // 3. Compare sum with original number
        return (sum == n);
    }
}