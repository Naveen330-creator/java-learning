public class Pattern6 {
    public static void main(String args[]) {
        System.out.println("print pattern ");
        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                // count = count + 2;
                System.out.print(count + ",");
                count = count + 2;
            }
            System.out.println(" ");
        }
    }

}
