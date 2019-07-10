package com.practice.recyclerviewexpandcollapse;

public class Movie {

    private String title;
    private String genre;
    private int year;

    //State of the item
    private boolean expanded;

    public Movie(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public boolean isExpanded() {
        return expanded;
    }
}
