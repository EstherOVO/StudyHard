package library;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

/*
        연습문제 : 주민등록번호로 생년월일과 성별 구별하기

        요구사항 :
        사용자로부터 주민등록번호를 입력받습니다.
        입력 형식은 "YYMMDD-XXXXXXX"입니다.
        주민등록번호를 분석하여 생년월일과 성별을 출력하는 프로그램을 작성하세요.

        성별 구별 번호는 주민등록번호의 뒷자리 첫 번째 숫자로,
        홀수이면 "남성", 짝수이면 "여성"으로 구별합니다.
        생년월일 출력 시 1900년 또는 2000년대 출생자 구분을 위해
        성별 구별 번호가 1, 2이면 1900년대,
        3, 4이면 2000년대 출생으로 가정합니다.

        입력 :
        ====
        주민등록번호 : 991231-1234567
        주민등록번호 : 010203-4321765

        실행 결과 예시 :
        =====
        생년월일 : 1999년 12월 31일
        성별 : 남성
        생년월일 : 2001년 02월 03일
        성별 : 여성
*/
        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("주민등록번호를 입력해 주세요(\"-\" 포함) : ");
            String ssn = scanner.nextLine();

            try {
                validateSsn(ssn);

                char gender = ssn.charAt(7);

                if (gender == '1' || gender == '3') {
                    System.out.println("성별 : 남성");
                } else {
                    System.out.println("성별 : 여성");
                }

                String[] split = ssn.split("-");
                String year = split[0].substring(0, 2);
                String month = split[0].substring(2, 4);
                String day = split[0].substring(4, 6);

                if (split[1].startsWith("1") || split[1].startsWith("2")) {
                    System.out.println("생년월일 : 19" + year + "년 " + month + "월 " + day + "일");
                } else {
                    System.out.println("생년월일 : 20" + year + "년 " + month + "월 " + day + "일");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void validateSsn(String ssn) {

        StringBuilder exceptionMessage = new StringBuilder();

        if (!ssn.contains("-")) {
            exceptionMessage.append("\"-\"를 포함하여 입력해 주세요.\n");
        }

        if (ssn.length() != 14) {
            exceptionMessage.append("주민등록번호를 다시 확인해 주시기를 바랍니다.");
        }

        if (!exceptionMessage.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }
}
