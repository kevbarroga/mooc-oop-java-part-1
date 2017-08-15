import java.util.ArrayList;

public class Library {
    private ArrayList<Book> book;

    public Library() {
        this.book = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.book.add(newBook);
    }

    public void printBooks() {
        for (Book bk : book) {
            System.out.println(bk);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (int i = 0; i < this.book.size(); i++) {
            if (StringUtils.included(this.book.get(i).title(), title)) {
            // if (this.book.title().contains(title)) {
                found.add(this.book.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (int i = 0; i < this.book.size(); i++) {
            if (StringUtils.included(this.book.get(i).publisher(), publisher)) {
            // if (this.book.get(i).publisher().contains(publisher)) {
                found.add(this.book.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (int i = 0; i < this.book.size(); i++) {
            if (this.book.get(i).year() == year) {
                found.add(this.book.get(i));
            }
        }
        return found;
    }

    public static void main(String[] args) {
        System.out.println("EXERCISE 101.2: LIBRARY");
        Library Library = new Library();

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);

        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        Library.printBooks();

        System.out.println("EXERCISE 101.3: SEARCH FUNCTIONALITY");
        Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = Library.searchByTitle("Cheese");
        for (Book book: result) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByYear(1851)) {
            System.out.println(book);
        }

	}

}
