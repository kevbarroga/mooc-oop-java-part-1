import java.util.Scanner;

public class PW {
    public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);

        while (true) {
        System.out.print("Type the password: ");
	String command = reader.nextLine();
            if (command.equals("carrot")) { 
                System.out.println("Right!\n");
	        break;
            } else {
	        System.out.println("Wrong!");
	    }
        }
        System.out.println("The secret is: qwerty asdf");
    }
}
