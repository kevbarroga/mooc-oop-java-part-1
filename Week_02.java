import java.util.Scanner;

public class Week_02 {

	public static void main(String[] args) {
		Week_02 test = new Week_02();
		//test.sumThree();
		//test.sumMany();
		//test.oneToOneHundred();
		//test.oneHundredToOne();
		//test.evens();
		//test.oneToLimit();
		//test.upperLower();
		//test.sumOneToLimit();
		//test.sumUpperLower();
		//test.factorial();
		test.inputLoop();
	}

    /*
	 * static methods can be called without an instance of an object
	 * non-static methods need to be called from an instance of the object ex. above
	 * */

	public void sumThree() {
		
		Scanner reader = new Scanner(System.in);
        int sum = 0;
		int read;
		
		System.out.print("Enter the first number: ");
		read = Integer.parseInt(reader.nextLine());
		sum += read;
		System.out.print("Enter the second number: ");
		read = Integer.parseInt(reader.nextLine());
		sum += read;
		System.out.print("Enter the third number: ");
		read = Integer.parseInt(reader.nextLine());
		sum += read;
		
		System.out.println("Sum: " + sum);
	}

	public void sumMany() {
		Scanner reader = new Scanner(System.in);

		int sum = 0;
		while (true) {
			int read = Integer.parseInt(reader.nextLine());
			if (read == 0) {
				break;
			}

			System.out.println(sum += read);

			System.out.println("Sum now: " + sum);
		}

		System.out.println("Total sum: " + sum);
	}

	public void oneToOneHundred() {
		int x = 1;
		while (x <= 100) {
			System.out.print(x + ", ");
			x++;
		}
	}

	public void oneHundredToOne() {
		int x = 100;
		while (x >= 1) {
			System.out.print(x + ", ");
			x--;
		}
	}

	public void evens() {
		int x = 1;
		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.print(x + ", ");
			}
			x++;
		}
	}

	public void oneToLimit() {
		Scanner reader = new Scanner(System.in);
		int x = 0;
		int read;

		System.out.print("Up to what number? ");
		read = Integer.parseInt(reader.nextLine());

		while (x <= read) {
			System.out.print(x + ", ");
			x++;
		}
	}

	public void upperLower() {
		Scanner reader = new Scanner(System.in);
		int x = 0;
		int upper;
		int lower;
		System.out.print("Lower: ");
		lower = Integer.parseInt(reader.nextLine());
		System.out.print("Upper: ");
		upper = Integer.parseInt(reader.nextLine());
		while(lower <= upper) {
			System.out.print(lower + ", ");
			lower++;
		}
	}

	public void sumOneToLimit() {
		Scanner reader = new Scanner(System.in);
		int x = 1;
		int read;
		int sum = 0;

		System.out.print("Up to what number? ");
		read = Integer.parseInt(reader.nextLine());

		while (x <= read) {
			sum += x;
			x++;
		}
		System.out.println("Sum is " + sum);
	}

	public void sumUpperLower() {
		Scanner reader = new Scanner(System.in);
		int x = 0;
		int upper;
		int lower;
		int sum = 0;
		System.out.print("Lower: ");
		lower = Integer.parseInt(reader.nextLine());
		System.out.print("Upper: ");
		upper = Integer.parseInt(reader.nextLine());
		while(lower <= upper) {
			sum += lower;
			lower++;
		}
		System.out.println("Sum is " + sum);
	}

	public void factorial() {
		Scanner reader = new Scanner(System.in);
		int input;
		int fac = 1;
		System.out.print("Enter a number: ");
		input = Integer.parseInt(reader.nextLine());
		while (input > 0) {
			fac *= input;
			input--;
		}
		System.out.println("Factorial is " + fac);
	}

	public void inputLoop() {
		Scanner reader = new Scanner(System.in);
		int input = 0;
		int inputCnt = 0;
		int sum = 0;
		double avg = 0;
		int evenCnt = 0;
		System.out.println("Enter numbers: ");

		while (input != -1) {
			input = Integer.parseInt(reader.nextLine());
			if (input != -1) { 
				sum += input;
            	inputCnt++;
			    if (input % 2 == 0) { evenCnt++; }
			}

		}
		System.out.println("Thanks, laters!");
		System.out.println("The sum is " + sum);
		System.out.println("Total numbers enterd: " + inputCnt);
		avg = (double)sum / inputCnt;
		System.out.println("Average: " + avg);
		System.out.println("Evens: " + evenCnt);
		int oddCnt = inputCnt - evenCnt;
		System.out.println("Odds :" + oddCnt);
	}
}
