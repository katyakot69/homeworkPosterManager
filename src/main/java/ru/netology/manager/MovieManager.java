package ru.netology.manager;

import ru.netology.domain.MovieData;

public class MovieManager {

    private MovieData[] movies = new MovieData[0];
    private MovieData[] moviesReverseAdd = new MovieData[0];
    private int limit;
    public MovieManager() {
        limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieData[] getMovies() {
        return movies;
    }

    public void setMovies(MovieData[] movies) {
        this.movies = movies;
    }

    public MovieData[] getMoviesReverseAdd() {
        return moviesReverseAdd;
    }

    public void setMoviesReverseAdd(MovieData[] moviesReverseAdd) {
        this.moviesReverseAdd = moviesReverseAdd;
    }


    public void add(MovieData movie) {
        MovieData[] tmp = new MovieData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length-1] = movie;
        movies = tmp;
    }


    public void findAll() {
        getMovies();
    }


    public void findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        }else {
            resultLength = limit;
        }
        MovieData[] tmp = new MovieData[resultLength];
        for (int i = 0, j = movies.length - 1; i < resultLength; i++, j--) {
            tmp[i] = movies[j];
        }
        moviesReverseAdd = tmp;
    }

}
