package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rating implements Serializable {

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
