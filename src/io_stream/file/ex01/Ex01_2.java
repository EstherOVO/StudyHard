package io_stream.file.ex01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex01_2 {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            Path path = Paths.get("src", "io_stream", "file", "ex01", "users2");

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

                        saveInfo(name, email, age, path);
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

    public static void saveInfo(String name, String email, int age, Path path) {

        try {

            Path file = Files.createFile(path.resolve(name + ".user"));

            List<String> list = new ArrayList<>(Arrays.asList(
                    "◎ 이름 : " + name, "◎ 이메일 : " + email, "◎ 나이 : " + age
            ));

            Files.write(file, list);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
