import java.util.Scanner;

public class Calculation {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ADD ");
        System.out.println("SUB ");
        System.out.println("MUL ");
        System.out.println("DIV ");
        System.out.println("Enter a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option in word ");
        String option = sc.nextLine();
        option = option.toUpperCase();
        switch (option) {
            case "ADD":
                System.out.println("Sum is " + (a + b));
                break;
            case "SUB":
                System.out.println("Sub is " + (a - b));
                break;
            case "MUL":
                System.out.println("Mul is " + (a * b));
                break;
            case "DIV":
                System.out.println("Div is " + (a / b));
                break;

        }
    }

}
