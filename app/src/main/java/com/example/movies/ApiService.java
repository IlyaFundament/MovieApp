package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {


    @GET("movie?token=TPRZ67R-GMJMQX8-JJ2MZRA-E0C2MSE&field=rating.imdb&search=1-5&sortField=votes.imdb&sortType=-1&limit=30")

    Single<MovieResponse> loadMovies(@Query("page") int page);

}
