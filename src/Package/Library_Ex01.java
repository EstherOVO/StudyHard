package Package;

public class Library_Ex01 {
    public static void main(String[] args) {

        Book book1 = new Book("노인과 바다", "어니스트 헤밍웨이(Ernest Miller Hemingway)");
        Book book2 = new Book("클린 코드", "로버트 C. 마틴(Robert C. Martin)");

        Library library = new Library(2);

        library.addBook(book1);
        library.addBook(book2);
        library.listBooks();
    }
}
