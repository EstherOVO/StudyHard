package generic.ex04;

public class Book implements Media {

    String title;
    String author;

    public String getTitle() {
        return title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
