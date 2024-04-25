package jdbc.DAO.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    Connection conn;

    public BookDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(BookDTO book) {

        String sql = "INSERT INTO books (isbn, title, author, publish_year, genre) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setInt(4, book.getPublish_year());
            pstmt.setString(5, book.getGenre());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BookDTO getBookByIsbn(String isbn) {

        String sql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE isbn = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                return new BookDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)
                );
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BookDTO> getBookByTitle(String title) {

        List<BookDTO> bookListWithTitle = new ArrayList<>();
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE title = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, title);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                BookDTO book = new BookDTO(rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );

                bookListWithTitle.add(book);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookListWithTitle;
    }

    @Override
    public List<BookDTO> getBookByAuthor(String author) {

        List<BookDTO> bookListWithAuthor = new ArrayList<>();
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE author = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, author);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                BookDTO book = new BookDTO(rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );

                bookListWithAuthor.add(book);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookListWithAuthor;
    }

    @Override
    public List<BookDTO> selectAllBooks() {

        List<BookDTO> bookList = new ArrayList<>();
        String sql = "SELECT * FROM books ORDER BY genre";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                BookDTO book = new BookDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)
                );

                bookList.add(book);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public void update(BookDTO book) {

        String sql = "UPDATE books SET title = ?, author = ?, publish_year = ?, genre = ? WHERE isbn = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3, book.getPublish_year());
            pstmt.setString(4, book.getGenre());
            pstmt.setString(5, book.getIsbn());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String isbn) {

        String sql = "DELETE FROM books WHERE isbn = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, isbn);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
