package collection.set;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {

/*
        연습문제 2. 고유 도시 이름 집합 만들기

        사용자로부터 여러 도시 이름을 입력받아,
        입력된 도시 이름 중 고유한 도시 이름만을 저장하고 출력하는 간단한 콘솔 프로그램을 작성합니다

        요구 사항
        - 사용자로부터 도시 이름을 계속해서 입력받습니다. 사용자가 "종료"라고 입력하면 입력을 중단합니다.
        - 입력받은 도시 이름 중 고유한 이름만을 저장하기 위해 HashSet을 사용합니다.
        - 모든 입력이 끝나면, 입력된 고유한 도시 이름들을 출력합니다.
        - 프로그램은 대소문자를 구분하지 않아야 합니다. 예를 들어, "Seoul"과 "seoul"은 동일한 도시로 간주합니다.
*/

        Scanner scanner = new Scanner(System.in);
        Set<String> cities = new HashSet<>();

        System.out.println("= 도시명을 입력해 주세요.(종료는 \"종료\" 입력) =");
        while (true) {

            System.out.print("- 도시명 : ");
            String input = scanner.next();

            cities.add(input);

            Iterator<String> it = cities.iterator();
            while (it.hasNext()) {
                if (it.next().equals("종료")) {
                    it.remove();
                    System.out.println("= 도시명 목록 =");
                    for (String city : cities) {
                        System.out.println("◐ " + city);
                    }
                    return;
                }
            }
        }
    }
}
