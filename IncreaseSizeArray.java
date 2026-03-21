public class IncreaseSizeArray {
    public static void main(String args[]) {
        int A[] = { 3, 5, 7, 8 };
        int B[] = new int[2 * A.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = B[i];

        }
        A = B;
        B = null;
        System.out.println(A.length);
    }

}
