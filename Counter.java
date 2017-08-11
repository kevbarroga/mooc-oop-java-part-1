public class Counter {

    private int value;
    private boolean nonNegative;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.nonNegative = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public boolean check() {
        return this.nonNegative;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    public void increase(int increaseAmt){
        if (increaseAmt > 0) {
            this.value += increaseAmt;
        }
    }

    public void decrease(int decreaseAmt) {
        if (this.nonNegative && this.value >= decreaseAmt) {
            this.value -= decreaseAmt;
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter(5, true);

        System.out.println(counter.value());
        System.out.println(counter.check());
        counter.increase();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());

        counter.increase(5);
        System.out.println(counter.value());
        counter.decrease(5);
        System.out.println(counter.value());
        counter.decrease(5);
        System.out.println(counter.value());
        counter.decrease(5);
        System.out.println(counter.value());

    }
}
