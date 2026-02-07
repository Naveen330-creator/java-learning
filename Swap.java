public class Swap {
    public static void main(String args[]) {
        int a = 44, b = 55;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swap the numbers   " + a + " " + b);
    }

}
