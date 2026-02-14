import java.util.Scanner;

public class DomainCase {
    public static void main(String args[]) {
        System.out.println("Enter the domain name ");
        Scanner sc = new Scanner(System.in);
        String domain = sc.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".") + 1);
        switch (ext) {
            case ("com"):
                System.out.println("commercial ");
                break;
            case ("gov"):
                System.out.println("Goverment ");
                break;
            case ("net"):
                System.out.println("Internet ");
                break;
            default:
                System.out.println("Naot valid");
                break;

        }

    }

}
