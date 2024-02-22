package filmsamling;

import java.util.Scanner;

public class Main {

    private static Controller controller = new Controller();

    public static void main(String[] args) {
        processUserActions();
    }

    public static void showMenu() {
        System.out.println("Welcome to my movie collection!\n" +
                " 1. Add a movie\n" +
                " 2. View the whole movie collection\n" +
                " 3. Exit");
    }

    public static void processUserActions() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            showMenu();
            String key = scanner.nextLine();
            if (key.equals("3")) {
                break;
            } else if (key.equals("1")) {
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
                controller.addMovieToMovieCollection(title, director, year, isColoured, length, genre);
            } else if (key.equals("2")) {
                printAllMovies();
            }

        }
    }

    public static void printAllMovies() {
        for (Movie movie : controller.findAllMovieFromMovieCollection()) {
            System.out.println(movie.toString());
        }
    }
}
