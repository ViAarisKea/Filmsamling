package filmsamling;

public class Movie {

    @Override
    public String toString() {
        String string =
                "Title:" + title + "\n" +
                "Director:" + director + "\n" +
                "Year created:" + yearCreated + "\n" +
                        "Coloured movie:";
        if(isInColor){
            string+= "yes\n";
        }else{
            string+="no\n";
        }

        string +=
                "Length(min):" + lengthInMinutes + "\n" +
                "Genre:" + genre + '\n';

        return string;
    }

    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    public Movie() {
    }

    public Movie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean isInColor() {
        return isInColor;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public String getGenre() {
        return genre;
    }
}
