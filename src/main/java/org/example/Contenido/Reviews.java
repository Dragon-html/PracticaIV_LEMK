package org.example.Contenido;

public class Reviews {
    private int reviewid;
    private String title;
    private String artist;
    private String url;
    private double score;
    private boolean best_new_music;
    private String author;
    private String author_type;
    private int pub_day;
    private int pub_month;
    private int pub_year;

    private int totalDiscos;
    private double maxScore;
    private double minScore;


    public Reviews(int reviewid, String title, String artist, String url, double score, boolean best_new_music, String author, String author_type, int pub_day, int pub_month, int pub_year, int totalDiscos, double maxScore, double minScore) {
        this.reviewid = reviewid;
        this.title = title;
        this.artist = artist;
        this.url = url;
        this.score = score;
        this.best_new_music = best_new_music;
        this.author = author;
        this.author_type = author_type;
        this.pub_day = pub_day;
        this.pub_month = pub_month;
        this.pub_year = pub_year;
        this.totalDiscos = totalDiscos;
        this.maxScore = maxScore;
        this.minScore = minScore;
    }

    public Reviews() {

    }


    public int getReviewid() {
        return reviewid;
    }

    public void setReviewid(int reviewid) {
        this.reviewid = reviewid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isBest_new_music() {
        return best_new_music;
    }

    public void setBest_new_music(boolean best_new_music) {
        this.best_new_music = best_new_music;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_type() {
        return author_type;
    }

    public void setAuthor_type(String author_type) {
        this.author_type = author_type;
    }

    public int getPub_day() {
        return pub_day;
    }

    public void setPub_day(int pub_day) {
        this.pub_day = pub_day;
    }

    public int getPub_month() {
        return pub_month;
    }

    public void setPub_month(int pub_month) {
        this.pub_month = pub_month;
    }

    public int getPub_year() {
        return pub_year;
    }

    public void setPub_year(int pub_year) {
        this.pub_year = pub_year;
    }

    public int getTotalDiscos() {
        return totalDiscos;
    }

    public void setTotalDiscos(int totalDiscos) {
        this.totalDiscos = totalDiscos;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getMinScore() {
        return minScore;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "reviewid=" + reviewid +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", url='" + url + '\'' +
                ", score=" + score +
                ", best_new_music=" + best_new_music +
                ", author='" + author + '\'' +
                ", author_type='" + author_type + '\'' +
                ", pub_day=" + pub_day +
                ", pub_month=" + pub_month +
                ", pub_year=" + pub_year +
                ", totalDiscos=" + totalDiscos +
                ", maxScore=" + maxScore +
                ", minScore=" + minScore +
                '}';
    }
}
