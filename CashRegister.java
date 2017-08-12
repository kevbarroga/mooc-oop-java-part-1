public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000.00;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= 2.50) {
        //    the price of lunch is added to register
            this.cashInRegister += 2.50;
        //    the amount of the sold lunches is incremented by one
            this.economicalSold++;
        //    the method returns cashGiven - lunch price
            return cashGiven - 2.50;
        } else {
        // if not enough money is given, all is returned and nothing else happens
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= 4.00) {
        //    the price of lunch is added to the register
            this.cashInRegister += 4.00;
        //    the amount of the sold lunches is incremented by one
            this.gourmetSold++;
        //    the method returns cashGiven - lunch price
            return cashGiven - 4.00;
        } else {
        // if not enough money is given, all is returned and nothing else happens
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        if (card.pay(2.50)) {
        //    the amount of sold lunches is incremented by one
            this.economicalSold++;
        //    the method returns true
            return true;
        } else {
        // if not, the method returns false
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        if (card.pay(4.00)) {
        //    the amount of sold lunches is incremented by one
            this.gourmetSold++;
        //    the method returns true
            return true;
        } else {
        // if not, the method returns false
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }

    public static void main(String[] args) {

        System.out.println("Exercise: 86.2 - Cash register and paying with cash");
        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was "  + theChange );

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was "  + theChange );

        System.out.println( unicafeExactum );

        System.out.println("Exercise: 86.3 - Paying with card");
        unicafeExactum = new CashRegister();

        theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println( unicafeExactum );

        System.out.println("Exercise: 86.4 - Loading money");
        unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}
