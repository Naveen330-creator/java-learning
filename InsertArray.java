public class InsertArray {
    public static void main(String args[]) {
        int A[] = new int[10];
        A[0] = 1;
        A[1] = 5;
        A[2] = 9;
        A[3] = 6;
        A[4] = 10;
        int n = 5;
        int index = 2;
        for (int i = n; i > index; i--) {
            A[i] = A[i - 1];

        }
        A[2] = 10;
        for (int X : A) {
            System.out.print(X + " ");
        }
    }

}
