package filmsamling;

import java.util.ArrayList;

public class MovieCollection {

    private ArrayList<Movie> movieCollection = new ArrayList<>();


    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes,
                         String genre) {
        Movie movieToAdd = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieCollection.add(movieToAdd);
        System.out.printf("The movie \" %s \" is added to the collection\n", movieCollection.get(movieCollection.size() - 1).getTitle());

        System.out.printf("There is now %d movies in the collection\n", movieCollection.size());
    }

    public ArrayList<Movie> findAllMovies() {
        return movieCollection;
    }


    public Movie editMovie(String oldTitle, String newTitle, String director, int yearCreated,
                           boolean isInColor, int lengthInMinutes, String genre) {

        Movie movieToEdit = findMovieByTitle(oldTitle);
        movieToEdit.setTitle(newTitle);
        movieToEdit.setDirector(director);
        movieToEdit.setYearCreated(yearCreated);
        movieToEdit.setInColor(isInColor);
        movieToEdit.setLengthInMinutes(lengthInMinutes);
        movieToEdit.setGenre(genre);

        movieCollection.set(movieCollection.indexOf(movieToEdit), movieToEdit);
        return movieToEdit;

    }

    public ArrayList<Movie> findAllMoviesByTitle(String title) {

        ArrayList<Movie> listOfFoundMovies = new ArrayList<>();

        for (Movie movie : movieCollection) {
            if (movie.getTitle().toUpperCase().contains(title.toUpperCase())) {
                listOfFoundMovies.add(movie);
            }
        }

        if (!listOfFoundMovies.isEmpty()) {
            return listOfFoundMovies;
        } else {
            System.out.printf("Movies with title \"%s\" are not found\n", title);
            return null;
        }
    }

    public Movie findMovieByTitle(String title) {

        for (Movie movie : movieCollection) {
            if (movie.getTitle().toUpperCase().contains(title.toUpperCase())) {
                return movie;
            }
        }
        //System.out.printf("Movie with title \"%s\" is not found\n", title);
        return null;
    }

    public boolean doesMovieExist(String title) {
        return findMovieByTitle(title) != null;
    }
}
