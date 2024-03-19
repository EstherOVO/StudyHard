package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {

/*
        문제 1. 고양이 이름 필터링

        고양이 이름이 담긴 리스트가 있습니다.
        이름이 4글자 이상인 고양이들만 필터링하여
        그 이름을 대문자로 변환한 후, 결과를 출력하세요.

        List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");

        출력 결과 :
        MILO
        LUNA
        BELLA
*/

        List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");

        String collect = catNames.stream()
                .filter(name -> name.length() >= 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println("네 글자 이상인 고양이 이름 : " + collect);

    }
}
