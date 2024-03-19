package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {

/*
        문제 5. 여행 일정 관리

        여러분은 여행 일정을 계획하고 있습니다.
        각 여행지는 도시 이름과 방문하려는 관광지 리스트로 구성되어 있습니다.
        여러분의 목표는 중복되는 관광지를 제거하고, 모든 도시의 관광지 리스트를 합친 뒤
        알파벳순으로 정렬하여 최종 여행지 리스트를 만드는 것입니다.

        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을"))
        );
*/

        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을"))
        );

        List<String> list = itinerary.stream()
                .flatMap(city -> city.getAttractions().stream())
                .distinct()
                .sorted()
                .toList();

        list.forEach(System.out::println);
    }

    public static class City {

        String name;
        List<String> attractions;

        public City(String name, List<String> attractions) {
            this.name = name;
            this.attractions = attractions;
        }

        public String getName() {
            return name;
        }

        public List<String> getAttractions() {
            return attractions;
        }
    }
}
