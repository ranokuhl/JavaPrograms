public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes <= -1) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        }
        else {
            int toMegaBytes = kiloBytes / 1024;
            int remainderKiloBytes = kiloBytes % 1024;

            System.out.println(
                    kiloBytes + " KB = " + toMegaBytes + " MB and " +
                            remainderKiloBytes + " KB"
            );
        }

    }

}
