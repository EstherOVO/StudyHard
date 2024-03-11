package generic.ex04;

public class Music implements Media {

    String title;
    String artist;

    public String getTitle() {
        return title;
    }

    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}
