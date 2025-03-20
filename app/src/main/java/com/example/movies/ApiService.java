package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {


    @GET("movie?token=TPRZ67R-GMJMQX8-JJ2MZRA-E0C2MSE&field=rating.imdb&search=1-5&sortField=votes.imdb&sortType=-1&limit=30&notNullFields=videos.trailers.url")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("review?token=TPRZ67R-GMJMQX8-JJ2MZRA-E0C2MSE&page=1&limit=5&sortField=createdAt&sortType=1")
    Single<ReviewResponse> loadReviews(@Query("movieId") int movieId);

    @GET("movie/{idFilms}?token=TPRZ67R-GMJMQX8-JJ2MZRA-E0C2MSE")
    Single<TrailerResponse> loadTrailers(@Path("idFilms") int idFilms);
}
