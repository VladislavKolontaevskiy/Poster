package ru.netology.domain;

public class Movie {
    private int id;
    private String movieName;
    private String imageUrl;
    private String genre;

    public Movie(int id, String movieName, String imageUrl, String genre) {
        this.id = id;
        this.movieName = movieName;
        this.imageUrl = imageUrl;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}