import java.util.*;

public class Week_04 {

	public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
		for (int num : second) {
			if (!first.contains(num)) {
				first.add(num);
			}
		}
	}

	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
		first.addAll(second);
	}

	public static void transfer (Account from, Account to, double amount) {
		from.withdrawal(amount);
		to.deposit(amount);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(3);
		list1.add(7);

		list2.add(5);
		list2.add(10);
		list2.add(7);

		smartCombine(list1, list2);

		System.out.println(list1); // prints [4, 3, 5, 10, 7]
		System.out.println(list2); // prints [5, 10, 7]
		System.out.println("===========================================");

		Account myAcct = new Account("My acct", 100.00);
		myAcct.deposit(20.00);
		System.out.println(myAcct);
		System.out.println("===========================================");
		Account matt = new Account("Matt's acct", 1000);
		Account me = new Account("My acct", 0);
		matt.withdrawal(100);
		me.deposit(100);
		System.out.println(matt);
		System.out.println(me);
		System.out.println("===========================================");
		Account a = new Account("A", 100);
		Account b = new Account("B", 0);
		Account c = new Account("C", 0);
		transfer(a,b,50);
		transfer(b,c,25);
		System.out.println(a+"\n"+b+"\n"+c);
		System.out.println("===========================================");
		Product product1 = new Product("Banana", 1.1, 13);
		product1.printProduct();
	}	
}
