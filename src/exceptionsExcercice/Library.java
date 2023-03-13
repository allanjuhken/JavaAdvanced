package exceptionsExcercice;

import accountExercise.Account;

public class Library {
    private Book[] books;
    private int numOfBooks;

    public Library(int librarySize) {
        books = new Book[librarySize];
        numOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numOfBooks == books.length){
            throw new IllegalStateException("Library is full");
        }
        books[numOfBooks] = book;
        numOfBooks++;
    }

    public Book searchBookById(int id){
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
        //String message = "Book doesn't exist";
        throw new NoBookFoundException("No book with ID: " + id + " found.");
    }
}
