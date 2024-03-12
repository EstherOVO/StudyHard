package collection.list.ex04;

import java.util.*;

public class VotingSystem {

    Map<String, Integer> map = new LinkedHashMap<>();
    int votes;

    public VotingSystem() {
        map.put("둘리", 0);
        map.put("고길동", 0);
        map.put("도우너", 0);
        map.put("마이콜", 0);
        map.put("희동이", 0);
    }

    public void startVoting() {

        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println();
                System.out.println("= 투표하고 싶은 후보의 번호를 입력하세요 =");
                System.out.print("""
                        ━ 후보목록 ━
                        1. 둘리
                        2. 고길동
                        3. 도우너
                        4. 마이콜
                        5. 희동이
                        ━━━━━━━━━━━
                        """);
                System.out.print("번호(종료는 \'0\' 입력) : ");
                int voteNumber = scanner.nextInt();

                switch (voteNumber) {
                    case 1 :
                        map.replace("둘리", map.get("둘리") + 1);
                        continue;
                    case 2 :
                        map.replace("고길동", map.get("고길동") + 1);
                        continue;
                    case 3 :
                        map.replace("도우너", map.get("도우너") + 1);
                        continue;
                    case 4 :
                        map.replace("마이콜", map.get("마이콜") + 1);
                        continue;
                    case 5 :
                        map.replace("희동이", map.get("희동이") + 1);
                        continue;
                    case 0 :
                        printResult();
                        System.out.println("투표를 종료합니다.");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("다시 시도해 주시기를 바랍니다.");
            }
        }
    }

    public void printResult() {
        int votes = 0;
        String electedPerson = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "표");
            for (int i = 0; i < map.size(); i++) {
                if (votes < entry.getValue()) {
                    votes = entry.getValue();
                    electedPerson = entry.getKey();
                }
            }
        }
        System.out.println(String.format("총 %d표로 %s님이 당선되었습니다!", votes, electedPerson));
    }
}
