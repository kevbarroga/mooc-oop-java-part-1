import java.util.Arrays;

public class Week_06 {

    public static void main(String[] args) {

        System.out.println("Exercise 96: Sum of the array");
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));

        System.out.println("Exercise 97: Elegant printing of an array");
        printElegantly(array);

        System.out.println("EXERCISE 98.1: COPY");
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));

        System.out.println("EXERCISE 98.2: REVERSE COPY");
        original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));

        System.out.println("Exercise 99: Array to stars");
        array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static int sum(int[] array) {
        // write code here
        int sum = 0;

        // for (int value : array) {
        //     sum += value;
        // }
        // return sum;

        // other version of for-loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum
    }

    public static void printElegantly(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (i == array.length) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
    }

    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }
        return reverse;
    }

    public static void printArrayAsStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*")
            }
        }
    }
}