package generic.ex04;

public class Ex04 {
    public static void main(String[] args) {

/*
        연습 문제 : 제네릭 다형성을 활용한 미디어 라이브러리

        문제 설명 :
        여러 종류의 미디어 항목(예: 책, 영화, 음악)을 관리하는 미디어 라이브러리를 구현합니다.
        각 미디어 항목은 공통적으로 제목(title)을 가지고 있으나, 특정 속성과 메소드는 각 미디어 타입에 따라 다릅니다.
        제네릭과 다형성을 활용하여, 다양한 타입의 미디어 항목을 유연하게 처리할 수 있는 라이브러리 시스템을 구축해야 합니다.

        요구사항 :
        - 미디어 항목의 기본 인터페이스 정의
        Media 인터페이스를 정의하고, 모든 미디어 항목이 가져야 하는 getTitle() 메소드를 포함시킵니다.

        - 다양한 미디어 타입 클래스 구현
        Media 인터페이스를 구현하는 Book, Movie, Music 클래스를 각각 정의합니다.
        각 클래스는 적절한 속성(예: 저자, 감독, 아티스트)과 메소드를 가집니다.

        - 미디어 라이브러리 클래스 구현
        MediaLibrary 클래스를 제네릭으로 정의하여, 다양한 타입의 Media 항목을 저장할 수 있습니다.
        addMedia 메소드와 printMediaTitles 메소드를 포함합니다.
*/

        MediaLibrary<Book> bookMediaLibrary = new MediaLibrary<>();
        bookMediaLibrary.addMedia(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        MediaLibrary<Movie> movieMediaLibrary = new MediaLibrary<>();
        movieMediaLibrary.addMedia(new Movie("Inception", "Christopher Nolan"));

        System.out.print("Books : ");
        bookMediaLibrary.printMediaTitles();

        System.out.print("Movies : ");
        movieMediaLibrary.printMediaTitles();
    }
}
