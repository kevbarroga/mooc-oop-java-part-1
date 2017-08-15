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
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));

        System.out.println("Exercise 99: Array to stars");
        printArrayAsStars(array);

        System.out.println("EXERCISE 104.1: SMALLEST");
        int[] values = {6, 5, 8, 3, 11};
        System.out.println("smallest: " + smallest(values));

        System.out.println("EXERCISE 104.2: THE INDEX OF THE SMALLEST");
		System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

        System.out.println("EXERCISE 104.3: INDEX OF THE SMALLEST AT THE END OF AN ARRAY");
		System.out.println(indexOfTheSmallestStartingFrom(values, 1));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		System.out.println(indexOfTheSmallestStartingFrom(values, 4));
		System.out.println("EXERCISE 104.4: SWAPPING VALUES");

		System.out.println( Arrays.toString(values) );

		swap(values, 1, 0);
		System.out.println( Arrays.toString(values) );

		swap(values, 0, 3);
		System.out.println( Arrays.toString(values) );

		System.out.println("EXERCISE 104.5: SORTING");
		int[] sortArray = {8, 3, 7, 9, 1, 2, 4};
		sort(sortArray);


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
        return sum;
    }

    public static void printElegantly(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
		System.out.println();
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
                System.out.print("*");
            }
        }
		System.out.println();
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
		int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
				index = i;
            }
        }
        return index;
    }
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		// write the code here
        int smallest = array[index];
        for (int i = index; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
				index = i;
            }
        }
        return index;
	}

	public static void swap(int[] array, int index1, int index2) {
		int temp1 = 0;
		int temp2 = 0;
		temp1 = array[index1];
		temp2 = array[index2];
		array[index1] = temp2;
		array[index2] = temp1;

	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array));
			int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
			swap(array, i, smallestIndex);
		}
	}

}
