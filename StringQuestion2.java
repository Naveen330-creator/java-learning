public class StringQuestion2 {
    public static void main(String args[]) {
        int b = 10110001;
        // String str1=valueOf(b);
        String str = b + "";
        System.out.println(str.matches("[01].*"));

    }

}
