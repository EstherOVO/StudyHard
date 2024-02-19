package Class;

public class Book {

    String title;
    String author;
    String isbn;
    boolean isAvailable;

    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    boolean borrowBook() {
        if (isAvailable == true) {
            System.out.println("\'" + title + "\'은(는) 도서 대출이 가능합니다.\n");
            return true;
        } else if (isAvailable == false) {
            System.out.println("\'" + title + "\'은(는) 도서 대출이 불가합니다.\n");
            return false;
        }
        return borrowBook();
    }

    boolean returnBook() {
        isAvailable = true;
        if (isAvailable == false) {
        }
        return true;
    }

    void printInfo() {
        System.out.println("· 책 제목 : " + title + "\n· 작가 : " + author + "\n· ISBN 넘버 : " + isbn);
        if (isAvailable == true) {
            System.out.println("▶ 대출 가능\n");
        } else if (isAvailable == false) {
            System.out.println("▶ 대출 불가\n");
        }
    }
}
