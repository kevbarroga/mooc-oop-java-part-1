import java.util.ArrayList;

public class Phonebook {
    private ArrayList<PersonWithPhoneNumber> phoneBook = new ArrayList<PersonWithPhoneNumber>();

    public void add(String name, String number) {
        PersonWithPhoneNumber person = new PersonWithPhoneNumber(name, number);
        this.phoneBook.add(person);
    }

    public void printAll(){
        for (PersonWithPhoneNumber person : this.phoneBook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (PersonWithPhoneNumber person : this.phoneBook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not found";
    }

	public static void main(String[] args) {
	    Phonebook phonebook = new Phonebook();

	    phonebook.add("Pekka Mikkola", "040-123123");
	    phonebook.add("Edsger Dijkstra", "045-456123");
	    phonebook.add("Donald Knuth", "050-222333");

	    phonebook.printAll();

		String number = phonebook.searchNumber("Pekka Mikkola");
		System.out.println( number );

		number = phonebook.searchNumber("Martti Tienari");
		System.out.println( number );
	}
}
