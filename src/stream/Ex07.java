package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex07 {
    public static void main(String[] args) {

/*
        문제 7. 영화 평점 기록 분석

        영화 평점 정보가 담긴 리스트가 있습니다.
        각 평점 정보는 영화의 이름과 평점(1 ~ 5)을 포함합니다.
        평점이 4 이상인 영화만 필터링하고, 그 결과를 확인하기 위해 peek를 사용하세요.
        마지막으로, 평점이 4 이상인 영화의 이름을 알파벳순으로 정렬하여 최종 목록을 출력하는 프로그램을 작성하세요.

        List<MovieRating> ratings = Arrays.asList(
            new MovieRating("Inception", 5),
            new MovieRating("The Godfather", 5),
            new MovieRating("Interstellar", 4),
            new MovieRating("Jurassic Park", 3),
            new MovieRating("The Dark Knight", 5),
            new MovieRating("Pulp Fiction", 4),
            new MovieRating("Some Movie", 2)
        );
*/

        List<MovieRating> ratings = Arrays.asList(
                new MovieRating("Inception", 5),
                new MovieRating("The Godfather", 5),
                new MovieRating("Interstellar", 4),
                new MovieRating("Jurassic Park", 3),
                new MovieRating("The Dark Knight", 5),
                new MovieRating("Pulp Fiction", 4),
                new MovieRating("Some Movie", 2)
        );

        String collect = ratings.stream()
                .filter(mr -> mr.getRating() >= 4)
                .peek(System.out::println)
                .map(MovieRating::getMovieName)
                .sorted()
                .collect(Collectors.joining(" - ", "[", "]"));

        System.out.println("Highest Rated Book Lists : " + collect);
    }

    public static class MovieRating {

        String movieName;
        int rating;

        public MovieRating(String movieName, int rating) {
            this.movieName = movieName;
            this.rating = rating;
        }

        public String getMovieName() {
            return movieName;
        }

        public int getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return "<" + movieName + "> ◆ Rating : " + rating;
        }
    }
}
