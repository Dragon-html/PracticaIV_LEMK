package org.example.Contenido;

public class Artists {
    int reviewed;
    String artist;

    public Artists(int reviewed, String artist) {
        this.reviewed = reviewed;
        this.artist = artist;
    }

    public int getReviewed() {
        return reviewed;
    }

    public void setReviewed(int reviewed) {
        this.reviewed = reviewed;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "reviewed=" + reviewed +
                ", artist='" + artist + '\'' +
                '}';
    }
}
