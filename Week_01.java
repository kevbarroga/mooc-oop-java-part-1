import java.util.Scanner;

public class Week_01 {
    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Jane Doe");
        System.out.println("===============");
        System.out.println("Hello world!");
        System.out.println("(And all the people of the world)");
        System.out.println("===============");
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");
        System.out.println("    *    ");
        System.out.println("===============");
	int numChicken = 9000;
	double numBacon = 0.1;
	String textTractor = "Zetor";

	System.out.println("Chickens:");
	System.out.println(numChicken);
	System.out.println("Bacon (kg):");
	System.out.println(numBacon);
	System.out.println("A Tractor:");
	System.out.println(textTractor + "\n");
	System.out.println("In a nutshell:");
	System.out.println(numChicken);
	System.out.println(numBacon);
	System.out.println(textTractor);
        System.out.println("===============");
	int dividend = 3;
	int divisor = 2;
	double quotient = 1.0 * dividend / divisor;
	System.out.println(quotient);
	double quotient1 = dividend / divisor * 1.0;
	System.out.println(quotient1);
        System.out.println("===============");
        int daysInYear = 365;
	int hoursInDay = 24;
	int minsInHour = 60;
	int secsInMin = 60;
	int secsInYear = daysInYear * hoursInDay * minsInHour * secsInMin;
	System.out.println("There are " +secsInYear+ " seconds in a year");
	System.out.println("===============");
	int x = 333;
	int y = 111;
	System.out.println(x + " + " + y + " = " + (x+y));
	System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println("===============");


	Scanner reader = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num_1 = Integer.parseInt(reader.nextLine());
	System.out.print("Enter another number: ");
	int num_2 = Integer.parseInt(reader.nextLine());
	System.out.println("Sum of the numbers: " + (num_1 + num_2));
	System.out.println("Division: " + num_1 + " / " + num_2 + " = " + ((double)num_1 / num_2));

	System.out.print("Enter the radius: ");
	int radius = Integer.parseInt(reader.nextLine());

	System.out.println("Circumference of the circle: " + (2 * Math.PI * radius));

	System.out.println("The larger number is: " + Math.max(num_1, num_2));
	if (num_1 == num_2) {
	    System.out.println("The numbers are equal!");
	}
	
	System.out.print("The number is ");
	if (num_1 >= 0) {
	    System.out.println("positive.");
	} else {
            System.out.println("negative.");
	}

	System.out.print("Number " + num_1);
	if (num_1 % 2 == 0) {
	    System.out.println(" is even.");
	} else {
	    System.out.println(" is odd.");
	}

	System.out.print("Type the points [0-60]: ");
	int points = Integer.parseInt(reader.nextLine());

	System.out.print("Grade: ");
	if (points >= 50) {
	    System.out.println("5");
	} else if (points >= 45) {
	    System.out.println("4");
	} else if (points >= 40) {
	    System.out.println("3");
	} else if (points >= 35) {
	    System.out.println("2");
	} else if (points >= 30) {
	    System.out.println("1");
	} else {
	    System.out.println("failed");
	}
        System.out.println("===============");
	System.out.print("Enter username: ");
	String username = reader.nextLine();
	System.out.print("Enter password: ");
	String password = reader.nextLine();

	if ((username.equals("alex") && password.equals("mightyducks")) || (username.equals("emily") && password.equals("cat"))) {
	    System.out.println("Logged in!");
	} else {
	    System.out.println("Username or password invalid");
	}
        System.out.println("===============");
	System.out.print("Type a year: ");
	int leapYear = Integer.parseInt(reader.nextLine());
	if (leapYear % 4 == 0) {
            //System.out.println("Year is a leap year");
	    if ((leapYear % 100 == 0) && (leapYear % 400 == 0)) {
		System.out.println("Year is a leap year");
	    } else {
	        System.out.println("Year is not a leap year");
	    }
	}

	System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
    }
}
