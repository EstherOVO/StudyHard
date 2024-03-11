package generic.ex04;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary <T extends Media> {

    List<T> mediaList;

    public MediaLibrary() {
        mediaList = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaList.add(media);
    }

    public void printMediaTitles() {
        for (T media : mediaList) {
            System.out.println(media.getTitle());
        }
    }
}
