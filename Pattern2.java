public class Pattern2 {
    public static void main(String args[]) {
        System.out.println("Print pattern ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i + j) + ",");
            }
            System.out.println("");
            // i = i + 1;
        }
    }

}
