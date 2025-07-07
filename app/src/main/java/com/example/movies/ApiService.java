package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {


    @GET("/v1.4/movie?token=TPRZ67R-GMJMQX8-JJ2MZRA-E0C2MSE&field=rating.imdb&search=1-5&sortField=votes.imdb&sortType=-1&limit=30&notNullFields=videos.trailers.url")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("/v1/review?token=TPRZ67R-GMJMQX8-JJ2MZRA-E0C2MSE&movieId=667")
    Single<ReviewResponse> loadReviews(@Query("movieId") int movieId);

    @GET("/v1.4/movie/{idFilms}?token=TPRZ67R-GMJMQX8-JJ2MZRA-E0C2MSE")
    Single<TrailerResponse> loadTrailers(@Path("idFilms") int idFilms);
}
