public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);  // 1 yr and 0 days
        printYearsAndDays(1051200); // 2 yrs and 0 days
        printYearsAndDays(561600);  // 1 year 25 days
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes >= 0 ) {


            long calcYears = minutes / 525600;
            long calcDays = (minutes % 525600) / 1440;



            System.out.println(minutes + " min = " + calcYears + " y and " + calcDays + " d");

        }

    }

}
