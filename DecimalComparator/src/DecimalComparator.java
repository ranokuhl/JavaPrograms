public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        return (long) (num1 * 1000) == (long) (num2 * 1000);
    }

}
