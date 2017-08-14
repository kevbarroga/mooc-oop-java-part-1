public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
      // the counters that represent hours, minutes and seconds are created and
      // set to have the correct initial values
      this.hours = new BoundedCounter(23);
      this.minutes = new BoundedCounter(59);
      this.seconds = new BoundedCounter(59);

      this.hours.setValue(hoursAtBeginning);
      this.minutes.setValue(minutesAtBeginning);
      this.seconds.setValue(secondsAtBeginning);
    }

    public void tick(){
      // Clock advances by one second
      seconds.next();
      if (seconds.getValue() == 0) {
        minutes.next();
        if (minutes.getValue() == 0) {
          hours.next();
        }
      }
    }

    public String toString() {
        // returns the string representation
      return this.hours+":"+this.minutes+":"+this.seconds;
    }

    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while( i < 20) {
            System.out.println( clock );
            clock.tick();
            i++;
        }
    }
}