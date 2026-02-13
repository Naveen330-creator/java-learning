import java.util.Scanner;

public class StringNumberRadix {
    public static void main(String args[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        String inputstring = sc.nextLine();
        if (inputstring.matches("[0-1]+")) {
            System.out.println("It is binary ");
        } else if (inputstring.matches("[0-7]+")) {
            System.out.println("it is Octal ");

        } else if (inputstring.matches("[0-9]+")) {
            System.out.println("It is decimal ");

        } else if (inputstring.matches("[0-9A-F]+"))
            ;

    }
    // else{
    // System.out.println("not valid");
}
