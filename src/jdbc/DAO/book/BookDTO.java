package jdbc.DAO.book;

public class BookDTO {

    private String isbn;
    private String title;
    private String author;
    private int publish_year;
    private String genre;

    public BookDTO(String isbn, String title, String author, int publish_year, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publish_year = publish_year;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublish_year() {
        return publish_year;
    }

    public String getGenre() {
        return genre;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("[%s] [%s] Title : %s | Author : %s | Publish Year : %d", genre, isbn, title, author, publish_year);
    }
}
