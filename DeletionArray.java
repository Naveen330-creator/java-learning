public class DeletionArray {
    public static void main(String args[]) {
        int A[] = new int[10];
        A[0] = 2;
        A[1] = 3;
        A[2] = 5;
        A[3] = 7;
        A[4] = 9;
        int n = 5;
        int index = 2;
        for (int i = index; i < n; i++) {
            A[i] = A[i + 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

    }

}
