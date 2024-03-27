package io_stream.file.ex02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {

/*
        연습 문제 2 : 텍스트 파일 병합 도구

        여러 개의 텍스트 파일을 입력받아
        그 내용을 모두 병합하여 새로운 파일에 저장하는 프로그램을 작성하세요.

        요구사항 :
        - 사용자로부터 병합할 텍스트 파일 경로들을 입력받습니다.
        - 모든 파일의 내용을 순서대로 읽어, "merged.txt"라는 새 파일에 병합하여 저장합니다.
        - 각 파일 내용의 구분을 위해 파일 병합 시 각 파일 내용 사이에 구분선(예: "-----")을 삽입합니다.
 */

        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get("src", "io_stream", "file", "ex02");

        try (Writer writer = new FileWriter(path.toFile() + "/merged.txt", true);
             BufferedWriter bw = new BufferedWriter(writer);){

            System.out.print("§ 병합할 파일의 개수를 입력하세요 : ");
            int number = scanner.nextInt();

            for (int i = 0; i < number; i++) {

                System.out.print("§ 파일 경로를 입력하세요 : ");
                String file = scanner.next();

                Path filePath = path.resolve(file);

                Stream<String> lines = Files.lines(filePath);

                List<String> list = lines.toList();

                for (String string : list) {
                    bw.write(string);
                    bw.newLine();
                }

                bw.write("----------");
                bw.newLine();
            }

            bw.flush();

        } catch (NoSuchFileException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
