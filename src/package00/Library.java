package package00;

public class Library {

    Book[] books;
    int index;

    public Library(int capacity) {
        this.books = new Book[capacity];
    }

    public void addBook(Book book) {
        books[index] = book;
        index++;
    }

    public void listBooks() {
        System.out.println("= 도서 목록 =");
        for (int i = 0; i < books.length; i++) {
            System.out.println("· 제목 : " + books[i].getTitle() + "\n· 저자 : " + books[i].getAuthor());
        }
    }
}
