package br.com.gabriel.dao;

import br.com.gabriel.model.Review;

import java.sql.Connection;
import java.util.List;

public class ReviewDAO {
    private final Connection connection;

    public ReviewDAO(Connection connection) {
        this.connection = connection;
    }

    void insert(Review review) {

    }

    double bookAverage(int bookId) {
        return 0.0;
    }

    List<Review> listBook(int bookId) {
        return null;
    }
}
