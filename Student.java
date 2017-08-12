import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    private String name;
    private String studentNumber;

    public String getName(){
        return this.name;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public String toString() {
        return this.name+" ("+this.studentNumber+")";
    }

    public static void main(String[] args) {
        System.out.println("EXERCISE 88.1: CLASS STUDENT");
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        System.out.println("EXERCISE 88.2: LIST OF STUDENTS");
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        String nameInput = ".";
        String numberInput = ".";

        while (!nameInput.isEmpty()) {
            System.out.print("name: ");
            nameInput = reader.nextLine();
            System.out.print("studentnumber: ");
            numberInput = reader.nextLine();

            list.add( new Student(nameInput, numberInput));

            for (Student student : list) {
                System.out.println(student);
            }
        }

        System.out.println("EXERCISE 88.3: SEARCH");
        String searchTerm = ".";

        System.out.print("Give search tern: ")
        searchTerm = reader.nextLine();
        System.out.println("Result");
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }

    }
}