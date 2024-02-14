package Array;

import java.util.Scanner;

public class ArrayEx04 {
    public static void main(String[] args) {

//      2차원 배열의 합계 구하기
//      2차원 정수 배열을 선언하고 모든 요소의 합계를 계산하는 프로그램을 만드세요.

        Scanner scanner = new Scanner(System.in);

//      행 입력받기
        System.out.print("몇 행 : ");
        int row = scanner.nextInt();

//      열 입력받기
        System.out.print("몇 열 : ");
        int column = scanner.nextInt();

//      행-열 값 입력받기
        System.out.println("행-열의 값을 순서대로 입력해 주세요 :\n예시) 2행 2열의 경우 : [0][0] → [0][1] → [1][0] → [1][1] 순서");

        int[][] rowColumn = new int[row][column];

        for (int i = 0; i < rowColumn.length; i++) {
            for (int j = 0; j < rowColumn[i].length; j++) {
                rowColumn[i][j] = scanner.nextInt();
            }
        }

//      입력값 산출
        System.out.print("입력한 값 : ");
        for (int i = 0; i < rowColumn.length; i++) {
            for (int j = 0; j < rowColumn[i].length; j++) {
                if (i == rowColumn.length - 1 && j == rowColumn[i].length - 1) {
                    System.out.print(rowColumn[i][j] + " ");
                } else {
                    System.out.print(rowColumn[i][j] + ", ");
                }
            }
        }

//      합계 구하기
        int sum = 0;
        for (int i = 0; i < rowColumn.length; i++) {
            for (int j = 0; j < rowColumn[i].length; j++) {
                sum += rowColumn[i][j];
            }
        }
        System.out.println("\n입력한 배열의 합계 : " + sum);

    }
}
