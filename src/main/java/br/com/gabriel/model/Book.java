package br.com.gabriel.model;

public class Book {
    private Integer id;
    private Integer year;
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private String synopsis;
    private Boolean read;

    public Book() {
    }

    public Book(Integer id, Integer year, String title, String author, String genre, String isbn, String synopsis, Boolean read) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.synopsis = synopsis;
        this.read = read;
    }

    public Integer getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Boolean isRead() {
        return read;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }
}
