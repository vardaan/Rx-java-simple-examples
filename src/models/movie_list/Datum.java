package models.movie_list;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Datum   {

    private static final String FIELD_PAGE_NUMBER = "page_number";
    private static final String FIELD_MOVIES = "movies";
    private static final String FIELD_MOVIE_COUNT = "movie_count";
    private static final String FIELD_LIMIT = "limit";


    @SerializedName(FIELD_PAGE_NUMBER)
    private int mPageNumber;
    @SerializedName(FIELD_MOVIES)
    private List<Movie> mMovies;
    @SerializedName(FIELD_MOVIE_COUNT)
    private int mMovieCount;
    @SerializedName(FIELD_LIMIT)
    private int mLimit;


    public Datum() {

    }

    public void setPageNumber(int pageNumber) {
        mPageNumber = pageNumber;
    }

    public int getPageNumber() {
        return mPageNumber;
    }

    public void setMovies(List<Movie> movies) {
        mMovies = movies;
    }

    public List<Movie> getMovies() {
        return mMovies;
    }

    public void setMovieCount(int movieCount) {
        mMovieCount = movieCount;
    }

    public int getMovieCount() {
        return mMovieCount;
    }

    public void setLimit(int limit) {
        mLimit = limit;
    }

    public int getLimit() {
        return mLimit;
    }





}