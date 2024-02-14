package Array;

import java.util.Scanner;

public class ArrayEx05 {
    public static void main(String[] args) {

//      2차원 배열을 활용한 점수 계산 문제
//      3명의 학생과 과목은 국어, 영어, 수학이 있다.
//      각각의 점수를 입력받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
//      +) 문자열 배열을 활용하여 해당 과목의 점수를 입력받기
//      +) 학생의 수를 입력받아서 n명만큼의 총점과 평균을 구하기

        Scanner scanner = new Scanner(System.in);

//      학생 수 입력받기
        System.out.print("학생 수를 입력하세요 : ");
        int studentsNumber = scanner.nextInt();

//      학생 이름 입력받기
        System.out.println("학생의 이름을 입력하세요.");
        String names1 = "이름";
        for (int n = 0; n <= studentsNumber; n++) {
            String names2 = scanner.nextLine();
            if (n == studentsNumber) {
                break;
            } else {
                System.out.print("이름 : ");
            }
        }

//      점수 입력받기
        int[][] scores = new int[studentsNumber][3];
        String[] subjects = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("이름을 입력한 순서대로 점수를 입력해 주세요.");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j]);
                scores[i][j] = scanner.nextInt();
            }
        }

//      합계 구하기
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }

//          결론
            System.out.println(i + 1 + "번째 학생의 점수 합계 : " + (double) sum + "점");
            System.out.println(i + 1 + "번째 학생의 점수 평균 : " + (double) sum / scores.length + "점");
        }

    }
}
