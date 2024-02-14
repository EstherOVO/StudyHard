package Array;

import java.util.Scanner;

public class ArrayEx06 {
    public static void main(String[] args) {

 /*
        배열에서 최댓값과 최솟값을 구하기
        정수를 n개 입력받아 배열에 저장하고,
        그중 가장 큰 수와 가장 작은 수를 구하는
        프로그램을 작성해 보세요.
 */

        Scanner scanner = new Scanner(System.in);

//      정수 개수 입력받기
        System.out.print("입력하실 정수의 개수를 말씀해 주세요 : ");
        int number1 = scanner.nextInt();

//      정수 입력받기
        System.out.println("정수를 입력해 주세요 : ");
        int[] number2 = new int[number1];

        for (int n = 0; n < number2.length; n++) {
            number2[n] = scanner.nextInt();
        }

//      최댓값 구하기
        int max = number2[0];   // 1. 첫 번째 배열의 값을 변수에 대입

        for (int i = 1; i < number2.length; i++) {  // 2. 두 번째부터 마지막 배열의 값까지 반복
            if (number2[i] > max) { // 3. 각 배열의 값을 차례대로 max의 값과 비교하여 더 큰 값을 max에 대입
                max = number2[i];
            }
        }
        System.out.println("최댓값 : " + max);

//      최솟값 구하기
        int min = number2[0];   // 1. 첫 번째 배열의 값을 변수에 대입

        for (int i = 1; i < number2.length; i++) {  // 2. 두 번째부터 마지막 배열의 값까지 반복
            if (number2[i] < min) { // 3. 각 배열의 값을 차례대로 min의 값과 비교하여 더 작은 값을 min에 대입
                min = number2[i];
            }
        }
        System.out.println("최솟값 : " + min);

    }
}
