package io_stream.file.ex01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {

/*
        연습 문제 1 : 사용자 정보 저장 및 조회 시스템

        사용자로부터 이름, 이메일, 나이를 입력받아
        각 사용자마다 개별 파일로 저장하는 프로그램을 작성하세요.
        그리고 저장된 사용자 정보 파일 목록을 조회할 수 있는 기능도 구현하세요.

        요구사항 :
        - 사용자 정보는 "사용자이름.user" 형식의 파일에 저장합니다.
        - 파일에는 이름, 이메일, 나이가 각 줄에 저장되어야 합니다.
        - 프로그램 실행 시 사용자에게 "정보 저장"과 "정보 조회" 중 선택할 수 있게 합니다.
        - "정보 조회" 선택 시 저장된 모든 사용자 정보 파일 목록을 출력합니다.

        실행 예시
        ===
        1: 정보 저장, 2: 정보 조회
        1
        이름: 홍길동
        이메일: abc@def.com
        나이: 30
        정보 저장 완료

        1 : 정보 저장, 2 : 정보 조회
        2
        홍길동.user
*/

        try {

            Scanner scanner = new Scanner(System.in);
            Path path = Paths.get("src", "io_stream", "file", "ex01", "users1");

            while (true) {

                System.out.println("[1] 정보 저장 | [2] 정보 조회 | 종료는 \"0\" 입력");
                System.out.print("§ 입력 번호 : ");
                int number = scanner.nextInt();

                switch (number) {
                    case 1 :
                        System.out.print("● 이름 : ");
                        String name = scanner.next();

                        System.out.print("● 이메일 : ");
                        String email = scanner.next();

                        System.out.print("● 나이 : ");
                        int age = scanner.nextInt();

//                      Writer writer = new FileWriter("src/io_stream/file/ex01/users1/" + name + ".user");
                        Path paths = path.resolve(name + ".user");
                        Writer writer = new FileWriter(paths.toFile());

                        saveInfo(name, email, age, writer);
                        break;
                    case 2 :
                        Stream<Path> list = Files.list(path);
                        list.map(Path::getFileName)
                                .forEach(System.out::println);
                        break;
                    case 0 :
                        System.out.println("프로그램을 종료합니다.");
                        return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveInfo(String name, String email, int age, Writer writer) {

        try (BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write("◎ 이름 : " + name);
            bw.newLine();

            bw.write("◎ 이메일 : " + email);
            bw.newLine();

            bw.write("◎ 나이 : " + age);

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
