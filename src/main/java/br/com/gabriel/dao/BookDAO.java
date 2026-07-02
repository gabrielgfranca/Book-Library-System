package br.com.gabriel.dao;

import br.com.gabriel.model.Book;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class BookDAO {
    private Connection connection;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    void insert(Book book) {

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
