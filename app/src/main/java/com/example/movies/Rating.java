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
    private String imdb;

    public Rating(String imdb) {
        this.imdb = imdb;
    }

    public String getImdb() {
        return imdb;
    }
}
