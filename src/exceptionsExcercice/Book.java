package exceptionsExcercice;

public class Book {
    int id;
    String title;
    String author;
    String yearOfRelease;

    //constructor
    public Book(int id, String title, String author, String yearOfRelease) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    // setters / getters
    public int getId() {
        return id;
    }


    @Override // Annotation, kirjutab return statementi etteantud tekstiga üle raamatu parameetrid
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                '}';
    }
}
