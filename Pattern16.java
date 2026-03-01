public class Pattern16 {
    public static void main(String args[]) {
        System.out.println("Print Pattern ");
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.format("%2d ", count);
                count = count + 2;
            }
            System.out.println(" ");
        }
    }

}
