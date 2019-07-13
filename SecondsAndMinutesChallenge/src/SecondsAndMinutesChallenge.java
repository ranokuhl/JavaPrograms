public class SecondsAndMinutesChallenge {

    public static int getDurationString(int minutes, int seconds) {

        if(minutes < 0 || (seconds < 0 || seconds > 59)){

            System.out.println("Invalid value");
            return -1;
        }


        int calcHoursFromMinutes = minutes * 60;
        int calcSecondsFromMinutes = seconds * 120;
        System.out.println(calcHoursFromMinutes + calcSecondsFromMinutes);
    }

}
