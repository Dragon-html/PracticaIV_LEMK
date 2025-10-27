package org.example.Contenido;

public class Labels {

    int reviewed;
    String label;

    public Labels(int reviewed, String label) {
        this.reviewed = reviewed;
        this.label = label;
    }

    public int getReviewed() {
        return reviewed;
    }

    public void setReviewed(int reviewed) {
        this.reviewed = reviewed;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Labels{" +
                "reviewed=" + reviewed +
                ", label='" + label + '\'' +
                '}';
    }
}
