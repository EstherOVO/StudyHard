package Array;

import java.util.Scanner;

public class ArrayEx03 {
    public static void main(String[] args) {

/*
        점수를 입력받을 학생 수를 입력받고,
        입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해 주세요.
        - 예시
        학생 수는 몇 명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력해 주세요 : ");
        int studentsNumber = scanner.nextInt();

        System.out.println("점수를 입력해 주세요 : ");
        int[] studentsScore = new int[studentsNumber];

        for (int i = 0; i < studentsScore.length; i++) {
            studentsScore[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < studentsScore.length; i++) {
            sum += studentsScore[i];
        }

        System.out.println("점수 합계 : " + (double) sum);
        System.out.println("평균 : " + (double) sum / studentsScore.length);

    }
}
