package exception.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

/*
        연습문제 1 : 사용자 입력 에러 처리

        요구사항 :
        사용자로부터 숫자 두 개를 입력받습니다.
        입력받은 두 숫자의 나눗셈 결과를 출력합니다.
        사용자가 0으로 나누려고 하면 ArithmeticException을 처리하여
        사용자에게 "0으로 나눌 수 없습니다."라고 알립니다.
        사용자가 숫자가 아닌 값을 입력했을 경우 InputMismatchException을 처리하여
        "유효한 숫자를 입력해 주세요."라고 알립니다.

        예상 실행 결과 :
        ===
        숫자 1을 입력하세요: 10
        숫자 2를 입력하세요: 2
        결과: 5

        숫자 1을 입력하세요: 10
        숫자 2를 입력하세요: 0
        0으로 나눌 수 없습니다.

        숫자 1을 입력하세요: a
        유효한 숫자를 입력해 주세요.
*/

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 정수를 입력해 주세요 : ");
            int firstNumber = scanner.nextInt();

            System.out.print("두 번째 정수를 입력해 주세요 : ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;
            System.out.println("몫 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("유효한 숫자를 입력해 주세요.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
