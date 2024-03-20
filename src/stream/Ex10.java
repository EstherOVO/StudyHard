package stream;

import java.util.Arrays;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {

/*
        문제 10. 학급의 학생 성적 분석

        학급에 속한 학생들의 성적이 주어져 있습니다.

        - 전체 학생의 평균 성적을 계산하세요.
        - 최고 성적을 받은 학생의 성적을 찾으세요.
        - 성적이 평균 이상인 학생의 수를 계산하세요.

        List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);

        출력예시
        ===
        평균 성적: 83.625
        최고 성적: 100
        평균 이상 성적 학생 수: 5
*/

        List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);

        double avg = grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);
        System.out.println("＆ 전체 학생의 평균 성적 : %.1f점".formatted(avg));

        int highestGrade = grades.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println("& 최고 성적 : " + highestGrade + "점");

        long hasHighScore = grades.stream()
                .filter(grade -> grade >= avg)
                .count();
        System.out.println("& 평균 이상 성적의 학생 수 : " + hasHighScore + "명");
    }
}
