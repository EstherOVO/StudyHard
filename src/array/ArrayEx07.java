package array;

import java.util.Scanner;

public class ArrayEx07 {

    public static int linearSearch(int[] numbers, int find) {
        int idx = -1;
        for(int i = 0; i < numbers.length; i++) {
            if(find == numbers[i]) {
                System.out.println("찾았다!");
                idx = i;
                break;
            }
        }
        return idx; // 찾는 숫자가 없으면 -1을 반환한다.
    }

    public static void main(String[] args) {

/*
        선형 탐색
        정수 배열에 임의의 정수들이 존재합니다.
        해당 배열을 출력하고, 사용자에게 특정 값을 입력받아
        특정 값이 배열 내에 존재하는지 확인하는 프로그램을 작성하세요
        예시)
        int[] numbers = {10, 54, 23, 45, 8, 5};
        찾는 값을 입력하세요 > 23
        배열의 3번째 위치에 존재합니다.
        (종료)
        찾는 값을 입력하세요 > 24
        배열에 존재하지 않습니다.
*/

//      정수 배열 입력
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 12, 54, 97, 36, 17, 43, 68, 84, 77, 28, 89, 12, 34, 31, 27};

//      찾는 숫자 입력받기
        System.out.print("int[] numbers = {");
        for (int n = 0; n < numbers.length; n++) {
            if (n == numbers.length - 1) {
                System.out.print(numbers[n] + "}");
            } else {
                System.out.print(numbers[n] + ", ");
            }
        }

        boolean findNumber = true;

        while (findNumber) {
            System.out.print("\n찾는 정수를 입력하세요(종료 시 \'-100\' 입력) : ");
            int find = scanner.nextInt();

//          종료를 원할 시
            if (find == -100) {
                findNumber = false;
            }

//          입력 숫자 찾기
            int idx = linearSearch(numbers, find);
            if (idx == -1) {   // 찾는 숫자가 없으면 -1을 반환
                System.out.println("찾을 수 없습니다.");
                break;
            } else {
                System.out.println("배열의 " + ((int) idx + 1) + "번째에 위치합니다.");
            }
        }
        System.out.println("종료합니다.");
        scanner.close();

    }
}
