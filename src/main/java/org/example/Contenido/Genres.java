package org.example.Contenido;

public class Genres {
    int reviewed;
    String genre;

    public Genres(int reviewed, String genre) {
        this.reviewed = reviewed;
        this.genre = genre;
    }

    public int getReviewed() {
        return reviewed;
    }

    public void setReviewed(int reviewed) {
        this.reviewed = reviewed;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genres{" +
                "reviewed=" + reviewed +
                ", genre='" + genre + '\'' +
                '}';
    }
}
