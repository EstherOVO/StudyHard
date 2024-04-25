package jdbc.DAO.book;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMain {

    private static Scanner scanner = new Scanner(System.in);
    private static BookDAO bookDAO;

    public static void main(String[] args) {

        bookDAO = new BookDAOImpl(DatabaseUtil.getConnection());

        while (true) {
            System.out.print("1. Insert | 2. Select | 3. Select All | 4. Update | 5. Delete | 6. Exit > ");
            String number = scanner.nextLine();

            switch (number) {
                case "1" -> insert();
                case "2" -> select();
                case "3" -> selectAllMembers();
                case "4" -> update();
                case "5" -> delete();
                case "6" -> {
                    System.out.println("Thank you. :)");
                    DatabaseUtil.close();
                    return;
                }
            }
        }
    }

    public static void insert() {

        System.out.println("[Insert]");
        System.out.print("ISBN : ");
        String isbn = scanner.nextLine();

        System.out.print("Title : ");
        String title = scanner.nextLine();

        System.out.print("Author : ");
        String author = scanner.nextLine();

        System.out.print("Publish Year : ");
        int publish_year = Integer.parseInt(scanner.nextLine());

        System.out.print("Genre : ");
        String genre = scanner.nextLine();

        BookDTO book = new BookDTO(isbn, title, author, publish_year, genre);

        bookDAO.insert(book);
    }

    public static void select() {

        System.out.println("[Select]");
        System.out.print("1. Search By ISBN | 2. Search By Title | 3. Search By Author > ");
        String number = scanner.nextLine();

        switch (number) {

            case "1" -> {
                System.out.print("ISBN : ");
                String isbn = scanner.nextLine();

                BookDTO bookByIsbn = bookDAO.getBookByIsbn(isbn);

                System.out.println("------------------");
                if (bookByIsbn != null) {
                    System.out.println("ISBN : " + bookByIsbn.getIsbn());
                    System.out.println("Title : " + bookByIsbn.getTitle());
                    System.out.println("Author : " + bookByIsbn.getAuthor());
                    System.out.println("Publish Year : " + bookByIsbn.getPublish_year());
                    System.out.println("Genre : " + bookByIsbn.getGenre());
                    System.out.println("------------------");
                } else {
                    System.out.println("Sorry, the book could not be found.");
                }
            }

            case "2" -> {
                System.out.print("Title : ");
                String title = scanner.nextLine();

                List<BookDTO> bookByTitle = bookDAO.getBookByTitle(title);

                System.out.println("------------------");
                for (BookDTO book : bookByTitle) {
                    if (book != null) {
                        System.out.println("ISBN : " + book.getIsbn());
                        System.out.println("Title : " + book.getTitle());
                        System.out.println("Author : " + book.getAuthor());
                        System.out.println("Publish Year : " + book.getPublish_year());
                        System.out.println("Genre : " + book.getGenre());
                        System.out.println("------------------");
                    } else {
                        System.out.println("Sorry, the book could not be found.");
                    }
                }
            }

            case "3" -> {
                System.out.print("Author : ");
                String author = scanner.nextLine();

                List<BookDTO> bookByAuthor = bookDAO.getBookByAuthor(author);

                System.out.println("------------------");
                for (BookDTO book : bookByAuthor) {
                    if (book != null) {
                        System.out.println("ISBN : " + book.getIsbn());
                        System.out.println("Title : " + book.getTitle());
                        System.out.println("Author : " + book.getAuthor());
                        System.out.println("Publish Year : " + book.getPublish_year());
                        System.out.println("Genre : " + book.getGenre());
                        System.out.println("------------------");
                    } else {
                        System.out.println("Sorry, the book could not be found.");
                    }
                }
            }
        }
    }

    public static void selectAllMembers() {

        System.out.println("[Select All]");

        List<BookDTO> bookList = bookDAO.selectAllBooks();

        Iterator<BookDTO> iter = bookList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void update() {

        System.out.println("[Update]");
        System.out.print("ISBN : ");
        String isbn = scanner.nextLine();

        BookDTO book = bookDAO.getBookByIsbn(isbn);

        if (book != null) {

            System.out.println(book);

            System.out.print("Title : ");
            String title = scanner.nextLine();
            if (!title.isEmpty()) book.setTitle(title);

            System.out.print("Author : ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) book.setAuthor(author);

            System.out.print("Publish Year : ");
            String publish_year = scanner.nextLine();
            if (!publish_year.isEmpty()) book.setPublish_year(Integer.parseInt(author));

            System.out.print("Genre : ");
            String genre = scanner.nextLine();
            if (!genre.isEmpty()) book.setGenre(genre);

            bookDAO.update(book);

            System.out.println("* Update Completed *");

        } else {
            System.out.println("Sorry, the book could not be found.");
        }
    }

    public static void delete() {

        System.out.println("[Delete]");
        System.out.print("ISBN : ");
        String isbn = scanner.nextLine();

        BookDTO book = bookDAO.getBookByIsbn(isbn);

        if (book != null) {

            System.out.println("Are you sure you want to delete it?");
            System.out.println("1. Yes | 2. No");
            String answer = scanner.nextLine();

            if (answer.equals("1")) {

                bookDAO.delete(isbn);

                System.out.println("* Deletion Complete *");
            }
        } else {
            System.out.println("Sorry, the book could not be found.");
        }
    }
}
