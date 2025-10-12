import java.lang.*;
import java.util.*;

public class CalculateArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float Area, Height, Base;
        System.out.println("Enter h and b ");
        Height = sc.nextFloat();
        Base = sc.nextFloat();
        Area = Height * Base / 2;
        System.out.println("Area is" + Area);
    }

}
