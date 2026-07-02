package br.com.gabriel.dao;

import br.com.gabriel.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class BookDAO {
    private final Connection connection;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    void insert(Book book) throws SQLException {
        String sql = "INSERT INTO books (id, title, author, publication_year, genre, isbn, is_read, synopsis) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, book.getId());
        ps.setString(2, book.getTitle());
        ps.setString(3, book.getAuthor());
        ps.setInt(4, book.getYear());
        ps.setString(5, book.getGenre());
        ps.setString(6, book.getIsbn());
        ps.setBoolean(7, book.isRead());
        ps.setString(8, book.getSynopsis());

        ps.executeUpdate();
    }

    List<Book> listAll(int pages) {
        return null;
    }

    List<Book> search(String term) {
        return null;
    }

    Optional<Book> findById(int id) {
        return Optional.empty();
    }

    void updateStatus(int id, boolean status) {

    }

    void delete(int id) {

    }

    List<Book> topFiveReviewed() {
        return null;
    }
}
