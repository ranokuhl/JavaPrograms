import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myArray = getIntegers(5);

        int[] sorted = sortArray(myArray);
        printArray(sorted);

    }

    public static int[] sortArray(int[] inputArray) {

        int[] sortedArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {

            sortedArray[i] = inputArray[i];
        }

        boolean flag = true;
        int temp;

        while(flag) {

            flag = false;

            for (int i = 0; i < sortedArray.length-1; i++) {

                if (sortedArray[i] < sortedArray[i+1]) {

                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return  sortedArray;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }
    }

    public static int[] getIntegers(int number) {

        int[] values = new int[number];

        System.out.println("Enter numbers: \r");

        for (int i = 0; i < values.length; i++) {

            values[i] = scanner.nextInt();

        }

        return values;
    }
}
