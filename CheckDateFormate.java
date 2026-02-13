import java.util.Scanner;

public class CheckDateFormate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid date");
        String userinput = sc.nextLine();
        System.out.println(userinput.matches("[0-3][0-9]/[0-1][0-2]/[0-9]{4}"));
        sc.close();
    }

}
