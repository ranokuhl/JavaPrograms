public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number){

        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10;
//        int firstDigit = number / 100;
//        return lastDigit + firstDigit;

        while(number > 9 ){
            number /= 10;
        }

        return lastDigit + number;

    }
}
