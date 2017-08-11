import java.util.Random;

public class PasswordRandomizer {
    // Define the variables here
    private int pwlength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.pwlength = length;
        random = new Random();
    }

    public String createPassword() {
      // Write the code here which returns the new password
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "`~!@#$%^&*()_=-+[]{}\\|;:'\",.<>/?";
        String pw = "";

		// TODO add complexity to generator
        for (int i=0; i<this.pwlength; i++) {
            pw += lowerCase.charAt(this.random.nextInt(25));
        }
		return pw;

    }

	public static void main(String[] args) {
		PasswordRandomizer pwgenerator = new PasswordRandomizer(16);

		for (int i = 0; i < 10; i++) {
			System.out.println(pwgenerator.createPassword());
		}
	}
}
