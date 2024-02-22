package practice;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int firstNumber = scanner.nextInt();

        System.out.print("두 번째 정수 : ");
        int secondNumber = scanner.nextInt();

        System.out.print("연산자 : ");
        String operator = scanner.next();

        switch (operator) {
            case "+" :
                System.out.println("두 수의 합 : " + (firstNumber + secondNumber));
                break;
            case "-" :
                System.out.println("두 수의 차 : " + (firstNumber - secondNumber));
                break;
            case "*" :
                System.out.println("두 수의 곱 : " + (firstNumber * secondNumber));
                break;
            case "/" :
                if (secondNumber == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    System.out.println("두 수의 나누기 : " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("다시 시도해 주시기를 바랍니다.");
        }
    }
}
