public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(24542));
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int remainder = number;
        int lastDigit = 0;

        while(remainder != 0){

            lastDigit = remainder % 10;
            reverse *= 10;
            reverse += lastDigit;
            remainder /= 10;
        }

        return number == reverse;



    }


}
