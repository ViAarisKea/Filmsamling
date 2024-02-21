package filmsamling;

public class Controller {

    private MovieCollection movieCollection = new MovieCollection();

    public void addMovieToMovieCollection(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes,
                                          String genre){
        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }
}
