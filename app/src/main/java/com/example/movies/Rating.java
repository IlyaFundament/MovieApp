package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @Override
    public String toString() {
        return "Rating{" +
                "imdb='" + imdb + '\'' +
                '}';
    }

    @SerializedName("imdb")
    private double imdb;

    public Rating(double imdb) {
        this.imdb = imdb;
    }

    public double getImdb() {
        return imdb;
    }
}
