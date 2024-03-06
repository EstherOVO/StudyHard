package library;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

/*
        실습 문제 : 문자열 정보 처리 및 분석

        요구사항 :
        당신은 텍스트 기반 데이터를 처리하는 소프트웨어를 개발하고 있습니다.
        사용자로부터 한 줄의 문자열을 입력받아,
        다음과 같은 정보를 출력하는 프로그램을 작성하세요.

        - 입력받은 문자열의 길이
        - 문자열에서 공백의 수
        - 문자열을 쉼표(,)로 분리한 후, 각 부분 문자열의 길이를 출력
        - 문자열이 "Java"를 포함하는지 여부
        - 문자열이 "프로그래밍"으로 끝나는지 여부
        - 문자열 중 "a" 문자가 몇 번 나타나는지 카운트(대소문자 구분 없음)
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력해 주세요 : ");
        String sentence = scanner.nextLine();

//      1.
        System.out.println("1. 문자열의 길이 : " + sentence.length());

//      2.
        int numberOfBlank = sentence.length() - sentence.replace(" ", "").length();
        System.out.println("2. 공백의 수 : " + numberOfBlank + "개");

//      3.
        System.out.print("3. 쉼표를 기준으로 나눈 문자열의 길이 : ");
        String[] splitComma = sentence.split(",");
        if (sentence.contains(",")) {
            for (int i = 0; i < splitComma.length; i++) {
                int splitCommaLength = splitComma[i].length();
                if (i == splitComma.length - 1) {
                    System.out.print(splitCommaLength + "개");
                } else {
                    System.out.print(splitCommaLength + "개, ");
                }
            }
        } else {
            System.out.println("입력하신 문자열에 쉼표가 없습니다.");
        }
        System.out.println();

//      4.
        System.out.print("4. 문자열에 \"자바(Java)\"가 포함되는가(대소문자 구분 없음) : ");
        boolean javaContains1 = sentence.toLowerCase().contains("JAVA".toLowerCase());
        boolean javaContains2 = sentence.contains("자바");
        if (javaContains1 || javaContains2) {
            System.out.println("포함됩니다.");
        } else {
            System.out.println("포함되지 않습니다.");
        }

//      5.
        System.out.print("5. 문자열이 \"프로그래밍\"으로 끝나는가 : ");
        if (sentence.endsWith("프로그래밍")) {
            System.out.println("\"프로그래밍\"으로 끝납니다.");
        } else {
            System.out.println("\"프로그래밍\"으로 끝나지 않습니다.");
        }

//      6.
        System.out.print("6. \"a\"(혹은 \"A\") 카운트 : ");
        int lowerACount = sentence.length() - sentence.replace("a", "").length();
        int upperACount = sentence.length() - sentence.replace("A", "").length();
        if (sentence.contains("a") || sentence.contains("A")) {
            System.out.println(lowerACount + upperACount + "번");
        } else {
            System.out.println("문자열에 \"a\"(혹은 \"A\")가 포함되어 있지 않습니다.");
        }

    }
}
