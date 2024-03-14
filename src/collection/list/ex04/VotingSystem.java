package collection.list.ex04;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VotingSystem {

    Map<String, Integer> map = new LinkedHashMap<>();

    public VotingSystem() {
        map.put("고길동", 0);
        map.put("둘리", 0);
        map.put("마이콜", 0);
        map.put("도우너", 0);
        map.put("희동이", 0);
    }

    public void startVoting() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("= 원하는 후보에게 투표해 주세요! =");
        System.out.println("""
                ┏ 후보 목록 ┓
                1. 고길동
                2. 둘리
                3. 마이콜
                4. 도우너
                5. 희동이
                ※ 종료는 \"0\"번을 입력해 주세요.
                """);
        while (true) {

            try {
                System.out.print("- 투표 번호 : ");
                int number = scanner.nextInt();

                validateNumber(number);

                switch (number) {
                    case 1 :
                        map.replace("고길동", map.get("고길동") + 1);
                        continue;
                    case 2 :
                        map.replace("둘리", map.get("둘리") + 1);
                        continue;
                    case 3 :
                        map.replace("마이콜", map.get("마이콜") + 1);
                        continue;
                    case 4 :
                        map.replace("도우너", map.get("도우너") + 1);
                        continue;
                    case 5 :
                        map.replace("희동이", map.get("희동이") + 1);
                        continue;
                    case 0 :
                        System.out.println("투표를 종료합니다.");
                        System.out.println("\n= 투표 결과 =");
                        printResult();
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 시도해 주시기 바랍니다.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void printResult() {

        map.forEach((key, value) -> System.out.println(key + " : " + value + "표"));

        int votes = 0;
        String winner = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (votes < entry.getValue()) {
                votes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println(String.format("총 %d표로 %s님이 당선되었습니다~", votes, winner));
    }

    public void validateNumber(int number) {

        StringBuilder exceptionMessage = new StringBuilder();

        if (number < 0 || number > map.size()) {
            exceptionMessage.append("후보 번호를 확인해 주시기 바랍니다.");
        }

        if (!exceptionMessage.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }
}
