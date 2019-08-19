public class Kata {


    public static void main(String[] args) {

        System.out.println(countingSheep(5));
    }

    public static String countingSheep(int num) {

        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 1; i < num; i++) {

            stringbuilder.append(i).append(" sheep...");

        }

        return stringbuilder.toString();




    }
}
