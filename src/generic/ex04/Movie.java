package generic.ex04;

public class Movie implements Media {

    String title;
    String director;

    public String getTitle() {
        return title;
    }

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
}
