package filmsamling;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void addOneMovie() {

        //Arrange
        String title = "Title";
        String director = "Director";
        int yearCreated = 1998;
        boolean isInColor = true;
        int lengthInMinutes = 88;
        String genre = "Genre";

        MovieCollection movieCollection = new MovieCollection();

        //Act
        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        int actualSize = movieCollection.findAllMovies().size();
        int expectedSize = 1;

        //Assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void addSeveralMovies(){
        //Arrange
        String title = "Title";
        String director = "Director";
        int yearCreated = 1998;
        boolean isInColor = true;
        int lengthInMinutes = 88;
        String genre = "Genre";

        String title2 = "Title2";
        String director2 = "Director2";
        int yearCreated2 = 2005;
        boolean isInColor2 = false;
        int lengthInMinutes2 = 120;
        String genre2 = "Genre2";

        String title3 = "Title3";
        String director3 = "Director3";
        int yearCreated3 = 2015;
        boolean isInColor3 = true;
        int lengthInMinutes3 = 130;
        String genre3 = "Genre3";

        MovieCollection movieCollection = new MovieCollection();

        //Act
        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieCollection.addMovie(title2, director2, yearCreated2, isInColor2, lengthInMinutes2, genre2);
        movieCollection.addMovie(title3, director3, yearCreated3, isInColor3, lengthInMinutes3, genre3);
        int actualSize = movieCollection.findAllMovies().size();
        int expectedSize = 3;

        //Assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void findAllMovies() {
        //Arrange
        String title = "Title";
        String director = "Director";
        int yearCreated = 1998;
        boolean isInColor = true;
        int lengthInMinutes = 88;
        String genre = "Genre";

        String title2 = "Title2";
        String director2 = "Director2";
        int yearCreated2 = 2005;
        boolean isInColor2 = false;
        int lengthInMinutes2 = 120;
        String genre2 = "Genre2";

        String title3 = "Title3";
        String director3 = "Director3";
        int yearCreated3 = 2015;
        boolean isInColor3 = true;
        int lengthInMinutes3 = 130;
        String genre3 = "Genre3";

        MovieCollection movieCollection = new MovieCollection();

        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieCollection.addMovie(title2, director2, yearCreated2, isInColor2, lengthInMinutes2, genre2);
        movieCollection.addMovie(title3, director3, yearCreated3, isInColor3, lengthInMinutes3, genre3);

        //Act
        ArrayList<Movie> movies = movieCollection.findAllMovies();
        int actualSize = movies.size();
        int expectedSize = 3;

        //Assert
        assertEquals(expectedSize, actualSize);
        for(Movie movie : movies){
            System.out.println(movie);
        }

    }

    @Test
    void findAllMoviesByTitle() {
        //Arrange
        String title = "Title";
        String director = "Director";
        int yearCreated = 1998;
        boolean isInColor = true;
        int lengthInMinutes = 88;
        String genre = "Genre";

        String title2 = "Title2";
        String director2 = "Director2";
        int yearCreated2 = 2005;
        boolean isInColor2 = false;
        int lengthInMinutes2 = 120;
        String genre2 = "Genre2";

        String title3 = "Title3";
        String director3 = "Director3";
        int yearCreated3 = 2015;
        boolean isInColor3 = true;
        int lengthInMinutes3 = 130;
        String genre3 = "Genre3";

        MovieCollection movieCollection = new MovieCollection();

        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieCollection.addMovie(title2, director2, yearCreated2, isInColor2, lengthInMinutes2, genre2);
        movieCollection.addMovie(title3, director3, yearCreated3, isInColor3, lengthInMinutes3, genre3);

        //Act
        ArrayList<Movie> foundMovie = movieCollection.findAllMoviesByTitle("title");
        int actualSize = foundMovie.size();
        int expectedSize = 3;

        //Assert
        assertEquals(expectedSize, actualSize);
    }
}