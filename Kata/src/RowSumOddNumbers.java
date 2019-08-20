public class RowSumOddNumbers {

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(3));
    }

    public static int rowSumOddNumbers(int n) {

        int sum = 0;
        for (int i = 1, row = 1; row <= n; row++) {

            sum = 0;
            for (int j = 0; j < row; j++, i+=2) {
                sum += i;
            }
        }

        return sum;
    }


}
