import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PrintStars {
	public static void main(String[] args) {
		PrintStars test = new PrintStars();
		//test.printStars(5);
		//printStars(6);
		//test.printSquare(4);
		//test.printRectangle(17, 3);
		//test.printTriangleLeft(4);
		//test.printTriangleRight(4);
		//test.xmasTree(10);
		test.guessGame();
	}

	public static void printStars(int numStars) {
		while(numStars > 0) {
			System.out.print("*");
			numStars--;
		}
	}

	public static void printTriangleLeft(int sideSize) {
		int x = 1;
		while (x <= sideSize) {
			printStars(x);
			System.out.println();
			x++;
		}
	}

	public static void printSquare(int size) {
		int x = 0;
		while (x < size) {
			printStars(size);
			System.out.println();
			x++;
		}
	}
	
	public static void printRectangle(int width, int height) {
		int x = 0;
		while (x < height) {
			printStars(width);
			System.out.println();
			x++;
		}
	}

	public static void printWhitespaces(int size) {
		while (size > 0) {
			System.out.print(" ");
			size--;
		}
	}

	public static void printTriangleRight(int sideSize) {
		int x = 1;
		while (x <= sideSize) {
			printWhitespaces(sideSize - x);
			printStars(x);
			System.out.println();
			x++;
		}
	}

	public static void xmasTree(int height) {
		int x = 1;
		while (x <= height) {
			printWhitespaces(height - x);
			printStars(x);
			printStars(x - 1);
			printWhitespaces(height - x);
			System.out.println();
			x++;
		}
		printWhitespaces(x - 3);
		printStars(3);
		System.out.println();
		printWhitespaces(x - 3);
		printStars(3);

	}

	public static void guessGame() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		System.out.println(randomNum);

		Scanner reader = new Scanner(System.in);
		int guess = -1;
		int guessCnt = 1;

		while (guess != randomNum) {
			System.out.print("Guess the number: ");
			guess = Integer.parseInt(reader.nextLine());
			if (guess == randomNum) { System.out.print("Correct"); }
			else if (guess < randomNum) { System.out.println("Higher, guesses made: " + guessCnt); }
			else { System.out.println("Lower, guesses made: " + guessCnt); }
			guessCnt++;
		}
	}
}
