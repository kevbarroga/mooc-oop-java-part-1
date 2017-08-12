public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros.";
    }

    public void payEconomical(){
        double cost = 2.50;
        if (this.balance >= cost) {
            this.balance = this.balance - cost;
        }
    }

    public void payGourmet() {
        double cost = 4.00;
        if (this.balance >= cost) {
            this.balance = this.balance - cost;
        }
    }

	public double balance() {
		return this.balance;
	}

    public void loadMoney(double amount) {
		this.balance += amount;
    }

    public boolean pay(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);

        System.out.println("Exercise: 77.2 - pay with card");
        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);

        System.out.println("Exercise: 77.3 - nonnegative balance");
        card = new LyyraCard(5);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        System.out.println("Exercise: 77.4 - loading money");
        card = new LyyraCard(10);
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);

        System.out.println("Exercise: 77.5 - loading negative");
        card = new LyyraCard(10);
        System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);

        System.out.println("Exercise: 77.6 - multiple cards");
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println(cardPekka);
        System.out.println(cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println(cardPekka);
        System.out.println(cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println(cardPekka);
        System.out.println(cardBrian);

        System.out.println("Exercise: 86.1 - Lyyra card and cash register");
        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

    }
}
