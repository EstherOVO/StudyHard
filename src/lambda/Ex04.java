package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {

        /*
        문제 4. 문자열 리스트 정렬

        요구사항 : 주어진 문자열 리스트를 문자열의 길이에 따라 오름차순으로 정렬하세요.
        정렬된 리스트의 각 요소를 출력합니다. Comparator와 Consumer를 사용하여 구현하세요.
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp", "ai");

        출력예시
        ===
        ai
        cpp
        java
        swift
        python
*/

        List<String> languages = Arrays.asList("java", "python", "swift", "cpp", "ai");

        languages.sort(Comparator.comparingInt(String::length));

        languages.forEach(System.out::println);
    }
}
