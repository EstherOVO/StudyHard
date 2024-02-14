package Array;

public class ArrayEx01 {
    public static void main(String[] args) {

//      학생들 점수가 10, 20, 30, 40, 50점입니다.
//      배열을 선언하고, 모든 학생의 합계 점수와 평균 점수를 구해보세요.

        int[] score = {10, 20, 30, 40, 50};

        System.out.print("학생들의 점수 : ");
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            if (i == score.length - 1) {
                System.out.print(score[i]);
            } else {
                System.out.print(score[i] + ", ");
            }
            sum += score[i];
        }
        System.out.println("\n점수 합계 : " + sum);
        System.out.println("점수 평균 : " + sum / score.length);

    }
}
