package io_stream.file.ex01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex01_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] 정보 저장 | [2] 정보 조회 | * 종료는 \"0\"을 입력해 주세요. *");

        Path path = Paths.get("src/", "io_stream", "file", "ex01", "users2");

        try {

            while (true) {

                System.out.println();
                System.out.print("⊙ 번호 : ");
                int number = scanner.nextInt();

                scanner.nextLine();

                switch (number) {
                    case 1:
                        System.out.print("● 이름 : ");
                        String name = scanner.nextLine();

                        System.out.print("● 이메일 : ");
                        String email = scanner.nextLine();

                        System.out.print("● 나이 : ");
                        int age = scanner.nextInt();

                        saveInfo(name, email, age, path);
                        break;
                    case 2 :
                        Files.list(path)
                                .map(Path::getFileName)
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

            if (!Files.exists(path)) Files.createDirectory(path);

            Path finalPath = Files.createFile(path.resolve(name + ".user"));

            List<String> list = new ArrayList<>(Arrays.asList(
                    "◎ 이름 : " + name, "◎ 이메일 : " + email, "◎ 나이 : " + age
            ));

            Files.write(finalPath, list);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
