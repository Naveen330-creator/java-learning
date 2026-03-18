public class SumOfAllElementInArray {
    public static void main(String args[]) {
        System.out.println("Print sum of an array ");
        int A[] = { 3, 4, 6, 7, 8 };
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];

        }
        System.out.println(sum);

        /*
         * for(int X : A){
         * sum = sum +A;
         * System.out.println(sum);
         * }
         */
    }

}
