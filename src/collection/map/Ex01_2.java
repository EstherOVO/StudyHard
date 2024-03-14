package collection.map;

import java.util.*;

public class Ex01_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> studentsScoreMap = new HashMap<>();

        System.out.println("학생의 이름과 점수를 입력해 주세요.\n(종료는 이름 칸과 점수 칸 모두 \"0\"을 입력해 주세요.)");
        while (true) {

            try {

                System.out.print("＊ 학생 이름을 입력해 주세요 : ");
                String name = scanner.next();

                System.out.print("＊ 학생 점수를 입력해 주세요 : ");
                int score = scanner.nextInt();

                studentsScoreMap.put(name, score);

                for (Map.Entry<String, Integer> entry1 : studentsScoreMap.entrySet()) {
                    if (entry1.getKey().equals("0") && entry1.getValue() == 0) {
                        studentsScoreMap.remove("0");
                        for (String string : studentsScoreMap.keySet()) {
                            System.out.println("학생 \"" + string + "\"의 점수는 " + studentsScoreMap.get(string) + "점입니다.");
                        }
                        return;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("다시 입력해 주시기를 바랍니다.");
                scanner.next();
            }
        }
    }
}
