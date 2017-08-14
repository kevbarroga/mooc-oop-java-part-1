
import java.util.Calendar;

public class PersonWithPhoneNumber {

    private String name;
    private String number;

    public PersonWithPhoneNumber(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }

    public String toString() {
        return this.name + ", number " + this.number;
    }

    public static void main(String[] args) {
        PersonWithPhoneNumber pekka = new PersonWithPhoneNumber("Pekka Mikkola", "040-123123");

        System.out.println(pekka.getName());
        System.out.println(pekka.getNumber());

        System.out.println(pekka);
        pekka.changeNumber("050-333444");
        System.out.println(pekka);
    }
}
