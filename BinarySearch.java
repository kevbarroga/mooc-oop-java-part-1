import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }
            if (array[middle] < searchedValue){
                beginning = middle + 1;
            }
            if (array[middle] > searchedValue){
                end = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Elements in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String etsittavaLuku = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(etsittavaLuku));

        if (result) {
            System.out.println("Value " + etsittavaLuku + " is in the array");
        }
        if (!result) {
              System.out.println("Value " + etsittavaLuku + " is not in the array");
        }
    }
}