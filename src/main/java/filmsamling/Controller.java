package filmsamling;

import java.util.ArrayList;

public class Controller {

    private MovieCollection movieCollection = new MovieCollection();

    public void addMovieToMovieCollection(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes,
                                          String genre){
        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }

    public ArrayList<Movie> findAllMovieFromMovieCollection(){
        return movieCollection.findAllMovies();
    }


    public ArrayList<Movie> findAllMoviesByTitle(String title){
        return movieCollection.findAllMovieByTitle(title);
    }


    public Movie editMovie(String oldTitle, String newTitle, String director,
                          int year, boolean isColoured, int length, String genre) {
        return movieCollection.editMovie(oldTitle, newTitle, director, year, isColoured, length, genre);
    }

}
