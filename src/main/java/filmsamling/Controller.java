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

    public Movie findMovieByIndex(int index){
        return movieCollection.findAMovie(index);
    }

    public ArrayList<Movie> findMovieByTitle(String title){
        return movieCollection.findMovieByTitle(title);
    }

}
