package filmsamling;

import java.util.ArrayList;

public class MovieCollection {

    private ArrayList<Movie> movieCollection = new ArrayList<>();



    public ArrayList<Movie> getMovieCollection() {
        return movieCollection;
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes,
            String genre){
        Movie movieToAdd = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieCollection.add(movieToAdd);
        System.out.printf("The movie \" %s \" is added to the collection\n", movieCollection.get(movieCollection.size()-1).getTitle());

        System.out.printf("There is now %d movies in the collection\n", movieCollection.size());
    }
}
