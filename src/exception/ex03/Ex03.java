package exception.ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

/*
        연습문제 3 : 사용자 입력 데이터 검증 및 예외 처리

        요구사항 :
        사용자로부터 이메일 주소를 입력받아, 올바른 형식인지 검증하는 프로그램을 작성하세요.
        이메일 주소가 올바른 형식이 아닐 경우, 사용자 정의 예외 InvalidEmailException을 발생시키고
        적절한 메시지를 출력하세요.
        이메일 형식 검증은 간단히 '@' 문자가 포함되어 있는지만 확인합니다.

        예상 실행 결과 :
        ===
        이메일 주소를 입력하세요 : user@example.com
        이메일 주소가 유효합니다.

        이메일 주소를 입력하세요 : userexample.com
        예외 발생 : 유효하지 않은 이메일 주소입니다.
*/

        try {
            setEmail();
            System.out.println("이메일 주소가 유효합니다.");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String setEmail() throws InvalidEmailException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("이메일 주소를 입력해 주세요 : ");
        String email = scanner.next();

        if (!email.contains("@")) {
            throw new InvalidEmailException(email);
        }
        return email;
    }
}
