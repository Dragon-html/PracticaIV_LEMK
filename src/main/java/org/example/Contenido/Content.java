package org.example.Contenido;

public class Content {
    int reviewed;
    String content;

    public Content(int reviewed, String content) {
        this.reviewed = reviewed;
        this.content = content;
    }

    public int getReviewed() {
        return reviewed;
    }

    public void setReviewed(int reviewed) {
        this.reviewed = reviewed;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Content{" +
                "reviewed=" + reviewed +
                ", content='" + content + '\'' +
                '}';
    }
}
