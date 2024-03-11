package generic.ex05;

public class Movie implements Media {

    String title;
    String director;

    public String getDetails() {
        return "Title : " + title + "\nDirector : " + director;
    }

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
}
