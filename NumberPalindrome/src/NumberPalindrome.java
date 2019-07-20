public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(24542));
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int remaining = number;
        int lastDigit = 0;

        while(remaining != 0){
            lastDigit = remaining % 10;
            reverse *= 10;
            reverse += lastDigit;
            remaining /= 10;

        }

        return number == reverse;

    }


}
