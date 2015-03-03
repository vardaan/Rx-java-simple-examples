package api;

import models.movie_list.MovieList;
import retrofit.http.GET;
import rx.Observable;

/**
 * Created by zapbuild on 3/3/15.
 */
public interface ApiInterface {
    @GET("/list_movies.json?quality=3D")
    Observable<MovieList> getMovies();
}
