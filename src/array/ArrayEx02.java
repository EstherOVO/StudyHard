package array;

import java.util.Scanner;

public class ArrayEx02 {
    public static void main(String[] args) {

/*
        5개의 정수를 입력받아서, 배열에 저장하고, 입력 순서대로 출력해보세요.
        - 예시
        정수를 5개 입력하세요.
        1
        2
        3
        4
        5
        >> 1, 2, 3, 4, 5
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요");
        System.out.print("첫 번째 정수 : ");
        String number1 = scanner.nextLine();
        System.out.print("두 번째 정수 : ");
        String number2 = scanner.nextLine();
        System.out.print("세 번째 정수 : ");
        String number3 = scanner.nextLine();
        System.out.print("네 번째 정수 : ");
        String number4 = scanner.nextLine();
        System.out.print("다섯 번째 정수 : ");
        String number5 = scanner.nextLine();

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int num3 = Integer.parseInt(number3);
        int num4 = Integer.parseInt(number4);
        int num5 = Integer.parseInt(number5);

        int[] numbers = new int[5];
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
        numbers[3] = num4;
        numbers[4] = num5;

        System.out.print("입력한 정수 : ");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i] + " ");
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

    }
}
