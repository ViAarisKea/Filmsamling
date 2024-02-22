package filmsamling;

import java.util.ArrayList;

public class MovieCollection {

    private ArrayList<Movie> movieCollection = new ArrayList<>();


    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes,
            String genre){
        Movie movieToAdd = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieCollection.add(movieToAdd);
        System.out.printf("The movie \" %s \" is added to the collection\n", movieCollection.get(movieCollection.size()-1).getTitle());

        System.out.printf("There is now %d movies in the collection\n", movieCollection.size());
    }

    public ArrayList<Movie> findAllMovies(){
        return movieCollection;
    }

    public Movie findAMovie(int index){
        return movieCollection.get(index);
    }

    public ArrayList<Movie> findMovieByTitle(String title){

        ArrayList<Movie> listOfFoundMovies = new ArrayList<>();

        for(Movie movie : movieCollection){
            if(movie.getTitle().toUpperCase().contains(title.toUpperCase())){
                listOfFoundMovies.add(movie);
            }
        }
        return listOfFoundMovies;

    }
}
