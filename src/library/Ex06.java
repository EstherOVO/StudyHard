package library;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex06 {
    public static void main(String[] args) {

/*
        연습 문제 2 : 랜덤 비밀번호 생성

        요구사항 :
        사용자로부터 비밀번호의 길이를 입력받아,
        해당 길이를 가진 랜덤 비밀번호를 생성하는 프로그램을 작성하세요.
        비밀번호는 대문자, 소문자, 숫자를 포함해야 합니다.

        입력 예시:
        8

        출력 예시:
        생성된 비밀번호: X7gA2fHq

        힌트 :
        비밀번호에 사용될 문자 세트
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("원하시는 암호의 길이를 입력해 주세요 : ");
        int length = scanner.nextInt();

        System.out.println(getRandomPassword(length));
    }

    public static String getRandomPassword(int length) {

        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        if (length < 3) {
            for (int i = 0; i < length; i++) {
                int idx = random.nextInt(charSet.length());
                sb.append(charSet.charAt(idx));
            }
            return sb.toString();
        } else {
            for (int i = 0; i < length; i++) {
                int idx = random.nextInt(charSet.length());
                sb.append(charSet.charAt(idx));
            }

            String pattern = ".*[0-9].*" + ".*[A-Z].*" + ".*[a-z].*";

            if (!Pattern.matches(pattern, sb.toString())) {
                return getRandomPassword(length);
            }
        }
        return sb.toString();
    }
}
