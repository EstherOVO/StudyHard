package jdbc.DAO.book;

import java.util.List;

public interface BookDAO {

    void insert(BookDTO book);
    BookDTO getBookByIsbn(String isbn);
    List<BookDTO> getBookByTitle(String title);
    List<BookDTO> getBookByAuthor(String author);
    List<BookDTO> selectAllBooks();
    void update(BookDTO book);
    void delete(String isbn);
}
