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

    public Boolean getRead() {
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
