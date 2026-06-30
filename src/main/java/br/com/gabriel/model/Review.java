package br.com.gabriel.model;

import java.time.LocalDateTime;

public class Review {
    private Integer id;
    private Integer bookId;
    private Double note;
    private String comment;
    private LocalDateTime date;

    public Integer getId() {
        return id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Double getNote() {
        return note;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
