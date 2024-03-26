package io_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

/*
        문제 : 사용자 입력 문자열을 파일에 저장하기

        문제 설명 :
        사용자로부터 문자열 입력을 받아 이를 "output.txt"라는 이름의 파일에 저장하는 자바 프로그램을 작성하세요.
        사용자가 "종료"라는 단어를 입력할 때까지 프로그램은 계속해서 사용자의 입력을 받습니다.
        모든 입력은 파일에 순차적으로 저장되어야 하며, 각 입력은 파일의 새로운 줄에 기록됩니다.
        사용자가 "종료"를 입력하면 프로그램은 실행을 마치고 파일에 지금까지 입력받은 내용을 모두 저장해야 합니다.

        요구사항 :
        - 사용자 입력받기 : 사용자로부터 문자열을 계속해서 입력받으세요. 입력은 터미널(콘솔)을 통해 이루어집니다.
        - 파일에 저장 : 사용자가 입력한 문자열을 "output.txt" 파일에 저장하세요.
        사용자가 새 문자열을 입력할 때마다, 이 문자열은 파일의 새로운 줄에 추가되어야 합니다.
        - 프로그램 종료 조건 : 사용자가 "종료"라고 입력하면, 프로그램은 더 이상 입력을 받지 않고 종료됩니다.
        이때, 지금까지 입력받은 모든 문자열이 "output.txt" 파일에 저장되어 있어야 합니다.

        실행 예시
        ===
        텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료) :
        > 안녕하세요
        > 자바 파일 입출력 연습입니다.
        > 종료

        output.txt
        ===
        안녕하세요
        자바 파일 입출력 연습입니다.
*/

        Scanner scanner = new Scanner(System.in);

        try (Writer writer = new FileWriter("src/io_stream/output.txt");
             BufferedWriter bw = new BufferedWriter(writer)) {

            System.out.println("출력하고 싶은 문장(혹은 단어)를 입력해 주세요.");

            while (true) {
                System.out.print("- 입력 : ");
                String str = scanner.nextLine();

                if (str.equals("종료")) break;

                bw.write(str);
                bw.newLine();
            }

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
