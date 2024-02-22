package filmsamling;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Controller controller = new Controller();

    public static void main(String[] args) {
        processUserActions();
    }

    public static void showMenu() {
        System.out.println("=====================\n" +
                "Welcome to my movie collection!\n" +
                " 1. Add a movie\n" +
                " 2. View the whole movie collection\n" +
                " 3. Search a movie by title\n" +
                " 4. Exit\n" +
                "=====================\n");
    }

    public static void processUserActions() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            String key = scanner.nextLine();
            if (key.equals("4")) {
                break;
            } else if (key.equals("1")) {
                System.out.println("Title of the movie?");
                String title = scanner.nextLine();
                System.out.println("Movie director?");
                String director = scanner.nextLine();
                System.out.println("Year of creation?");
                int year = scanner.nextInt();
                System.out.println("Is it coloured? yes/no");
                boolean isColoured = false;
                String colored = scanner.next();
                if(colored.equalsIgnoreCase("yes")) isColoured = true;
                System.out.println("Length in minutes?");
                int length = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Genre?");
                String genre = scanner.nextLine();

                System.out.println("Adding new movie to the collection...");
                controller.addMovieToMovieCollection(title, director, year, isColoured, length, genre);

            } else if (key.equals("2")) {
                printAllMovies();
            } else if(key.equals("3")){
                System.out.println("enter title to search:");
                String title = scanner.nextLine();
                findMoviesByTitle(title);
            }

        }
    }

    public static void printAllMovies() {
        for (Movie movie : controller.findAllMovieFromMovieCollection()) {
            System.out.println(movie.toString());
        }
    }

    public static void findMoviesByTitle(String title){
        ArrayList<Movie> foundMovies = controller.findMovieByTitle(title);
        if(!foundMovies.isEmpty()){
            System.out.printf("There are found %d movies by searching \"%s\" \n", foundMovies.size(), title);
            for(Movie movie : foundMovies){
                System.out.println(movie);
            }
        }else{
            System.out.printf("Movies with title \"%s\" is not found\n", title);
        }
    }
}
