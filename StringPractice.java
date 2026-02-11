
public class StringPractice {
    public static void main(String args[]) {
        char c[] = { 'N', 'V', 'M', 'R' };
        byte b[] = { 65, 66, 67, 68 };
        String str3 = new String(b, 1, 3);
        String str1 = "Java Program";
        String str2 = new String(c);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }

}
