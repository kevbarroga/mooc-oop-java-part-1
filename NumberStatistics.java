import java.util.Scanner;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.sum = 0
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return (double) this.sum / this.amountOfNumbers;
        }
    }

    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);

        System.out.println("Exercise: 79.1 - amount of numbers");
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());

        System.out.println("Exercise: 79.2 - sum and average");
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());

        System.out.println("Exercise: 79.3 - ask input from user");
        stats = new NumberStatistics();
        NumberStatistics evens = new NumberStatistics();
        NumberStatistics odds = new NumberStatistics();

        System.out.print("Enter numbers (-1 to exit): ");
        int input = 0;

        while(input != -1) {
            input = Integer.parseInt(reader.nextLine());
            if (input >= 0) {
                stats.addNumber(input);
                if (input % 2 == 0) {
                    evens.addNumber(input);
                } else {
                    odds.addNumber(input);
                }
            }
        }
        System.out.println("sum: " + stats.sum())
        System.out.println("sum of evens: " + evens.sum())
        System.out.println("sum of odds: " + odds.sum())
    }
}