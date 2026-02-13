public class RemoveExtraSpace {
    public static void main(String args[]) {
        String str = "     abc    578  hhdj";
        String str1 = str.trim();
        System.out.println(str1.replaceAll("\\s+", ""));
    }

}
