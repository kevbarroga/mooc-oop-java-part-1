public class DecreasingCounter {

    private int value;   // object variable that remembers the value of the counter
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one
        if (this.value >= 0) {
            this.value--;
        }
    }

    // and here the rest of the methods
    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.initialValue;
    }

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);
        System.out.println("Exercise: 75.1 - test decrease()");
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();

        DecreasingCounter counter = new DecreasingCounter(2);
        System.out.println("Exercise: 75.2 - value remain positive");
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();

        DecreasingCounter counter = new DecreasingCounter(100);
        System.out.println("Exercise: 75.3 - counter reset");
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        DecreasingCounter counter = new DecreasingCounter(100);
        System.out.println("Exercise: 75.4 - back to initial value");
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
    