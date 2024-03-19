package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

/*
        문제 3. 알파벳 정렬
        알파벳이 뒤죽박죽인 리스트가 있습니다.
        이를 알파벳순으로 정렬한 후, 결과를 출력하세요.
        단, 대소문자 구분 없이 정렬하세요.

        List<String> alphabets = Arrays.asList("b", "A", "d", "C", "f", "e", "D", "c", "F", "B", "E");

        출력 결과 :
        A
        B
        C
        D
        E
        F
        b
        c
        d
        e
        f
 */

        List<String> alphabets = Arrays.asList("b", "A", "d", "C", "f", "e", "D", "c", "F", "B", "E");

        List<String> list = alphabets.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.thenComparing(Comparator.reverseOrder()))
                .toList();

        list.forEach(System.out::println);
    }
}
