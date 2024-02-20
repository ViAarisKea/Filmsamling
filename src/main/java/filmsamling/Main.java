package filmsamling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MovieCollection movieCollection = new MovieCollection();


        System.out.println("Title of the movie?");
        String title = scanner.nextLine();
        System.out.println("Movie director?");
        String director = scanner.nextLine();
        System.out.println("Year of creation?");
        int year = scanner.nextInt();
        System.out.println("Is it coloured? Answer true if it's colored and false if it's black&white");
        boolean isColoured = scanner.nextBoolean();
        System.out.println("Length in minutes?");
        int length = scanner.nextInt();
        System.out.println("Genre?");
        String genre = scanner.nextLine();

        System.out.println("Adding new movie to the collection...");

        movieCollection.addMovie(title, director, year, isColoured, length, genre);

    }
}
