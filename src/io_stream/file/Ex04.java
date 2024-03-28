package io_stream.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {

/*
        연습 문제 4 : 자바 프로젝트 코드 분석

        현재 Java 프로젝트의 src 디렉토리 내에 있는
        모든 자바 파일(.java)에 대한 코드 분석을 수행하는 프로그램을 작성하세요.
        분석 결과로 다음 정보를 출력해야 합니다.

        요구사항 :
        - src 디렉토리 내에 있는 총 자바 파일(.java)의 개수
        - 모든 자바 파일의 총 코드 라인 수
        - 실습 문제(파일 이름이 "EX")로 시작하는 파일의 수

        출력 예시
        ===
        자바 프로젝트 코드 분석 결과
        - 총 자바 파일 개수 : xxx개
        - 총 코드 라인 수 : xxxxx줄
        - 실습 문제 풀이 수 : xxx개
*/

        long totalFiles = 0;
        long totalCodeLines1 = 0;
        long totalCodeLines2 = 0;
        long totalExNum = 0;

        Path path = Paths.get("src");

        try {

//          1. 총 파일 개수
            totalFiles = Files.walk(path)
                    .filter(p -> !Files.isDirectory(p))
                    .filter(p -> p.toFile().toString().endsWith(".java"))
                    .count();

            System.out.println("■ 총 파일 개수 : " + totalFiles + "개");

//          2. 총 코드 라인 수
            totalCodeLines1 = Files.walk(path)
                    .filter(p -> p.toFile().isFile())
                    .filter(p -> p.toFile().toString().endsWith(".java"))
                    .mapToLong(p -> {
                        try {
                            return Files.lines(p).count();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }).sum();

            List<Path> list = Files.walk(path)
                    .filter(p -> p.toFile().isFile())
                    .filter(p -> p.getFileName().toString().endsWith(".java"))
                    .toList();

            for (Path pt : list) {
                long countLines = Files.lines(pt)
                        .count();
                if (countLines == 1) break;
                totalCodeLines2 += countLines;
            }

            System.out.println(String.format("■ 총 코드 라인 수 : %d(%d)줄", totalCodeLines1, totalCodeLines2));

//          3. 실습 문제 풀이 수
            totalExNum = Files.walk(path)
                    .filter(p -> !Files.isDirectory(p))
                    .filter(p -> p.getFileName().toString().startsWith("Ex"))
                    .count();

            System.out.println("■ 실습 문제 풀이 수 : " + totalExNum + "개");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
