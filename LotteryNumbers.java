import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.random = new Random();
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
		for (int i = 0; i < 7; i++) {
			int rand = this.random.nextInt(38) + 1;
			if (!this.containsNumber(rand)) {
				this.numbers.add(rand);
			}
		}
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
		return numbers.contains(number);
    }

    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
