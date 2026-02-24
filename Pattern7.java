public class Pattern7 {
    public static void main(String args[]) {
        System.out.println("Print pattern ");
        // int count = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + ",");
                // count--;
            }
            System.out.println("");
        }
    }

}
