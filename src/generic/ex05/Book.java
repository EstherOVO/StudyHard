package generic.ex05;

public class Book implements Media {

    String title;
    String author;

    public String getDetails() {
        return "Title : " + title + "\nAuthor : " + author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
