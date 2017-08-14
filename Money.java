public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int toteuros = this.euros + added.euros;
        int totcents = this.cents + added.cents;

        return new Money(toteuros, totcents);
    }

    public boolean less(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        }
        if (this.euros == compared.euros) {
            if(this.cents > compared.cents) {
                return false;
            }
        }
        return true;
    }

    public Money minus(Money decremented) {
        if (this.less(decremented)) {
            int euros1 = 0;
            int cents1 = 0;

            return new Money(euros1, cents1);
        } else {
            int euros1 = this.euros - decremented.euros;
            int cents1 = this.cents - decremented.cents;
            if(this.cents < decremented.cents) {
                euros1--;
                cents1 = 100 - decremented.cents;
            }
            return new Money(euros1, cents1);
        }
    }

    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NOTE: new Money-object is created and reference to that
                                //           is assigned to variable a.
                                //       The Money object 10.00e that variable a used to hold
                                //           is not referenced anymore

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = new Money(10,0);
        b = new Money(3,0);
        c = new Money(5,0);

        System.out.println(a.less(b));  // false
        System.out.println(b.less(c));  // true

        a = new Money(10,0);
        b = new Money(3,50);

        c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
                                //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
  
    }
}
