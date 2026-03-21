public class RotateRight {
    public static void main(String args[]) {
        int A[] = { 3, 4, 7, 6, 8 }; // 8,3,4,7,6

        int temp = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }

        A[0] = temp;
        for (int X : A) {
            System.out.print(X + " ");
        }
    }
}
