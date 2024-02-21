package filmsamling;

import java.util.Scanner;

public class Main {

    private static MovieCollection movieCollection = new MovieCollection();

    public static void main(String[] args) {


        showMenu();
        scanAndCreateMovie();

    }

    public static void showMenu(){
        System.out.println("Welcome to my movie collection!\n 1. Add a movie\n 2. Exit");
    }

    public static void scanAndCreateMovie(){
        Scanner scanner = new Scanner(System.in);

        while(true){


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
            scanner.nextLine();
            System.out.println("Genre?");
            String genre = scanner.nextLine();



            System.out.println("Adding new movie to the collection...");
            movieCollection.addMovie(title, director, year, isColoured, length, genre);

            System.out.println("Press q to quit or enter to continue");

            String key = scanner.nextLine();
            if(key.equals("q")) break;

        }
    }
}
