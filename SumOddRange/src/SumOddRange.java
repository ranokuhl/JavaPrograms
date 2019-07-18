public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(isOdd(5));
        System.out.println(isOdd(4));
        System.out.println(isOdd(8));
        System.out.println(isOdd(-5));
        System.out.println(isOdd(15));
        System.out.println("========================");
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println("========================");
        System.out.println(sumOdd(10, 5));
        System.out.println(sumOdd(10, 10));
    }

    public static int sumOdd(int start, int end){

        if ((start > end) || (start <= 0) || (end <= 0)){
            return -1;
        }


        int sum = 0;


        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {

                sum += i;

            }
        }


        return sum;
    }

    public static boolean isOdd(int number){

        if (number < 0) {
            return false;
        }
        else return number % 2 != 0;
    }

}
