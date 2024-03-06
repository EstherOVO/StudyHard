package library;

public class Ex02 {
    public static void main(String[] args) {

/*
        요구사항 :
        사용자 정보가 담긴 문자열 데이터가 있습니다.
        각 사용자 정보는 세미콜론(;)으로 구분되어 있으며,
        각 사용자의 정보 내에서는 이름, 나이, 이메일이 콤마(,)로 구분되어 있습니다.
        이 데이터를 파싱하여 다음 정보를 출력하는 프로그램을 작성하세요.

        - 전체 사용자 수
        - 각 사용자의 이름, 나이, 이메일 정보 출력
        - 입력된 사용자 중 이메일 도메인이 "gmail.com"인 사용자의 이름을 출력
        - 가장 나이가 많은 사용자의 이름과 나이 출력
        - 이름에 "김"이 포함된 사용자 수
*/

        String people = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

//      1.
        String[] totalNumber = people.split(";");
        System.out.println("▣ 전체 사용자 수 : " + totalNumber.length + "명");

//      2.
        System.out.println("▣ 사용자 정보 : ");
        String[] splitSemiColon = people.split(";");
        for (int i = 0; i < splitSemiColon.length; i++) {
            String[] splitComma = splitSemiColon[i].split(",");
            System.out.println("(" + (i + 1) + ") 이름 : " + splitComma[0] + " | 나이 : " + splitComma[1] + "세 | 이메일 : " + splitComma[2]);
        }

//      3.
        System.out.print("▣ \"gmail.com\" 도메인 사용자 : ");
        for (int j = 0; j < splitSemiColon.length; j++) {
            if (splitSemiColon[j].contains("gmail.com")) {
                if (j == splitSemiColon.length - 1) {
                    System.out.print(splitSemiColon[j].substring(0, 3));
                } else {
                    System.out.print(splitSemiColon[j].substring(0, 3) + ", ");
                }
            }
        }
        System.out.println();

//      4.
        System.out.println("▣ 가장 나이가 많은 사용자 : ");
        int[] ages = new int[4];
        for (int i = 0; i < splitSemiColon.length; i++) {
            String[] splitComma = splitSemiColon[i].split(",");
            ages[i] = Integer.parseInt(splitComma[1]);
        }

        int max = 0;
        for (int i = 0; i < ages.length; i++) {
            if (max < ages[i]) {
                max = ages[i];
            }
        }
        String strMax = String.valueOf(max);

        for (int i = 0; i < splitSemiColon.length; i++) {
            if (splitSemiColon[i].contains(strMax)) {
                System.out.println("이름 : " + splitSemiColon[i].substring(0, 3) + " | 나이 : " + max + "세");
            }
        }

//      5.
        int kimCount = people.length() - people.replace("김", "").length();
        System.out.println("▣ 김가네 : " + kimCount + "명");
    }
}
