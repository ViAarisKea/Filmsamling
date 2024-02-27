package filmsamling;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Controller controller = new Controller();

    public void startProgram(){
        processUserActions();
    }

    public void showMenu() {
        System.out.println("=====================\n" +
                "Welcome to my movie collection!\n" +
                " 1. Add a movie\n" +
                " 2. View the whole movie collection\n" +
                " 3. Search a movie by title\n" +
                " 4. Edit movie details\n" +
                " 5. Exit\n" +
                "=====================\n");
    }

    public void processUserActions() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            String key = scanner.nextLine();
            if (key.equals("5")) {
                break;
            } else if (key.equals("1")) {
                addMovie(scanner);
            } else if (key.equals("2")) {
                printAllMovies();
            } else if(key.equals("3")){
                findMoviesByTitle(scanner);
            } else if(key.equals("4")){
                editMovie(scanner);
            }
        }
    }

    public void printAllMovies() {
        for (Movie movie : controller.findAllMovieFromMovieCollection()) {
            System.out.println(movie);
        }
    }

    public void editMovie(Scanner scanner){
        System.out.println("Which movie you want to edit? enter the exact title:");
        String titleOfMovieToEdit = scanner.nextLine();

        System.out.println("Type in the new information. Title of the movie?");
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

        Movie editedMovie = controller.editMovie(titleOfMovieToEdit, title, director, year, isColoured, length, genre);
        if(editedMovie != null){
            System.out.printf("The information about the movie \"%s\" is edited\n", titleOfMovieToEdit);
        }
    }

    public void addMovie(Scanner scanner){
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
    }

    public void findMoviesByTitle(Scanner scanner) {
        System.out.println("Enter title to search:");
        String title = scanner.nextLine();
        ArrayList<Movie> foundMovies = controller.findAllMoviesByTitle(title);
        if (foundMovies != null) {
            System.out.printf("There are found %d movies by searching \"%s\" \n", foundMovies.size(), title);
            for (Movie movie : foundMovies) {
                System.out.println(movie);
            }
        }
    }
}
