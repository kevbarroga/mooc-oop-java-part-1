import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Welcome to the calc app");
	Scanner reader = new Scanner(System.in);

        while (true) {
        System.out.print("Enter command (sum, diff, exit): ");
	String command = reader.nextLine();
	if (command.equals("exit")) { break; }

	System.out.println("Enter the numbers: ");
	int first = Integer.parseInt(reader.nextLine());
	int second = Integer.parseInt(reader.nextLine());

	if (command.equals("sum")) {
	    int sum = first + second;
	    System.out.println("The sum of the numbers is " + sum);
	} else if (command.equals("diff")) {
	    int diff = first - second;
	    System.out.println("The difference of the numbers is " + diff);
	} else { System.out.println("Unknown command"); }

        }
        System.out.println("Thanks, bye");
    }
}
