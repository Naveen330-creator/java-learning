import java.util.Scanner;

public class CalculateAreaAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, s, area;

        System.out.println("Enter the three sides of the triangle:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        // Calculate semi-perimeter
        s = (a + b + c) / 2;

        // Calculate area using Heron's formula
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle is: " + area);
    }
}
