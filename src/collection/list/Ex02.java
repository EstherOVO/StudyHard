package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

/*
        문제 2 : 요소 제거

        문자열을 저장하는 ArrayList를 생성하고, 여러 개의 문자열을 추가하세요.
        그 후, 특정 조건(예: 길이가 5 이하인 문자열)을 만족하는 요소들을 모두 제거하세요.
        최종 리스트를 출력하는 프로그램을 작성하세요.

        > 예시 문자열
        "Hello", "World", "Java" "Programming"
        > 제거 후 리스트에 남은 요소
        "Java"
*/

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");

        System.out.println(stringList);

        Iterator<String> it = stringList.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.length() <= 5) {
                it.remove();
            }
        }

        System.out.println(stringList);
    }
}
