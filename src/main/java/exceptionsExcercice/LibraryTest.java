package exceptionsExcercice;

import java.sql.SQLException;

public class LibraryTest {
    public static void main(String[] args) {
        try {
            Library lib = new Library(10);

            lib.addBook(new Book(1,"Kobin Hood","Mingi tüüp", "1985"));
            lib.addBook(new Book(2, "uus raamat", "mina ise", "1890"));
            lib.addBook(new Book(5,"There's no book","Joku Muu", "2021"));

            System.out.println(lib.searchBookById(5));
        }catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
