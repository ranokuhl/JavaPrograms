import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter < 10){
            int order = counter + 1;



            System.out.println("Enter number # " + order);

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){

                int number = scanner.nextInt();
                counter++;
                sum += number;

            } else {

                System.out.println("Invalid number");
            }

        }



    }

}
