package com.driver;

public class Movie {
    private String name;
    private int durationInMinutes;
    private double imdbRatting;

    public Movie(String name, int durationInMinutes, double imdbRatting) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.imdbRatting = imdbRatting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImdbRatting() {
        return imdbRatting;
    }

    public void setImdbRatting(double imdbRatting) {
        this.imdbRatting = imdbRatting;
    }

}
