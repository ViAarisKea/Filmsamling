package filmsamling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MovieCollection movieCollection = new MovieCollection();


        System.out.println("Title of the movie?");
        String title = scanner.next();
        System.out.println("Movie director?");
        String director = scanner.next();
        System.out.println("Year of creation?");
        int year = scanner.nextInt();
        System.out.println("Is it coloured?");
        boolean isColoured = scanner.nextBoolean();
        System.out.println("Length in minutes?");
        int length = scanner.nextInt();
        System.out.println("Genre?");
        String genre = scanner.next();

        System.out.println("Adding new movie to the collection...");

        movieCollection.addMovie(title, director, year, isColoured, length, genre);

    }
}
