public class RemoveSpecialCharacter {
    public static void main(String arga[]) {
        String str = "a!B@c#1$2%3/abc123";
        System.out.println(str.replaceAll("[^0-9a-zA-Z]", ""));

    }

}
