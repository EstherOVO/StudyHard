package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Ex08 {
    public static void main(String[] args) {

/*
        문제 8. 온라인 도서관 시스템

        온라인 도서관 시스템에서 사용자들이 대출한 책 목록을 관리하고 있습니다.
        각 대출 기록은 사용자 ID와 대출한 책의 목록으로 구성됩니다.
        시스템은 사용자가 특정 조건을 만족하는지 여부에 따라 다음 단계의 작업을 수행해야 합니다.

        요구사항 :
        - 모든 사용자가 적어도 하나의 책을 대출했는지 검사합니다.
        - 적어도 한 명의 사용자가 "Java Programming" 책을 대출했는지 검사합니다.
        - 어떤 사용자도 "The Great Gatsby" 책을 대출하지 않았는지 검사합니다.

        Map<String, List<String>> userBookRentals = Map.of(
            "user1", Arrays.asList("The Lord of the Rings", "Java Programming"),
            "user2", Arrays.asList("Java Programming", "Effective Java"),
            "user3", Arrays.asList("The Hobbit"),
            "user4", Collections.emptyList() // 이 사용자는 책을 대출하지 않았습니다.
        );
 */

        Map<String, List<String>> userBookRentals = Map.of(
                "user1", Arrays.asList("The Lord of the Rings", "Java Programming"),
                "user2", Arrays.asList("Java Programming", "Effective Java"),
                "user3", Arrays.asList("The Hobbit"),
                "user4", Collections.emptyList() // 이 사용자는 책을 대출하지 않았습니다.
        );

        boolean allHaveBook = userBookRentals.entrySet().stream()
                .allMatch(entry -> !entry.getValue().isEmpty());
        System.out.println(allHaveBook ? "모든 사용자가 책을 대출하였습니다." : "대출하지 않은 사용자가 존재합니다.");

        boolean hasJavaBook = userBookRentals.entrySet().stream()
                .anyMatch(entry -> entry.getValue().contains("Java Programming"));
        System.out.println(hasJavaBook ? "\"Java Programming\"은 현재 대출 중입니다." : "\"Java Programming\"은 대출이 가능합니다.");

        boolean hasGatsbyBook = userBookRentals.entrySet().stream()
                .noneMatch(entry -> entry.getValue().contains("The Great Gatsby"));
        System.out.println(hasGatsbyBook ? "\"The Great Gatsby\"는 대출이 가능합니다" : "\"The Great Gatsby\"는 현재 대출 중입니다.");
    }
}
