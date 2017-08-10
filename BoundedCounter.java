import java.util.Scanner;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        this.value++;
        if (this.value > upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value >=0 || value <= upperLimit){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BoundedCounter counter = new BoundedCounter(4);

        System.out.println("Exercise: 78.1 - BoundedCounter");
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 10) {
            counter.next();
            System.out.println("Value: " + counter );
            i++;
        }

        System.out.println("Exercise: 78.2 - print initial zero");
        counter = new BoundedCounter(14);
        System.out.println("Value at start: " + counter );

        i = 0;
        while ( i < 16){
            counter.next();
            System.out.println("value: " + counter );
            i++;
        }

        System.out.println("Exercise: 78.3 - clock v1");
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            // advance minutes
			minutes.next();
            // if minutes become zero, advance hours
			if (minutes.getValue() == 0) {
				hours.next();
			}
            i++;
        }

        System.out.println("Exercise: 78.4 - clock v2");
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        minutes = new BoundedCounter(59);
        hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
		// read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        i = 0;
        while ( i < 121 ) {
            // like in previous but seconds taken into account
			System.out.println( hours + ":" + minutes + ":" + seconds );
			seconds.next();
			if (seconds.getValue() == 0) {
				minutes.next();
				if (minutes.getValue() == 0) {
					hours.next();
				}
			}
            i++;
        }

        // continuous clock
        // while ( true ) {
        //     System.out.println( hours + ":" + minutes + ":" + seconds );
        //     Thread.sleep(1000);
        //     // put here the logic to advance your clock by one second
        // }
    }
}
