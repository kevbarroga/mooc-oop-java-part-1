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
        char lowerCase = "abcdefghijklmnopqrstuvwxyz";
        char upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char numbers = "0123456789";
        char special = "`~!@#$%^&*()_=-+[]{}\|;:'\",.<>/?";
        String pw = "";

        for (int i=0; i<this.pwlength; i++) {
            pw += lowerCase.charAt(this.random.nextInt(25))
        }

    }
}