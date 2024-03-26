package io_stream;

import java.io.*;

public class Ex02 {
    public static void main(String[] args) {

/*
        문제 : 로그 파일 분석기

        문제 설명 :
        로그 파일을 분석하는 자바 프로그램을 작성해야 합니다.
        이 프로그램은 로그 파일에서 "에러(ERROR)"가 발생한 모든 라인을 찾아
        그 내용을 별도의 파일("errorLogs.txt")에 저장해야 합니다.
        로그 파일의 경로는 프로그램 실행 시 사용자로부터 입력받으며,
        분석 완료 후 사용자에게 "분석 완료" 메시지와 함께 에러 로그의 총 개수를 출력해야 합니다.

        요구사항 :
        - 로그 파일 경로 분석 : 로그 파일은 server.log 에 저장되어 있습니다.
        - 에러 로그 분석: 로그 파일을 읽고, "ERROR"라는 단어가 포함된 모든 라인을 찾습니다.
        - 결과 저장: 찾은 에러 로그를 "errorLogs.txt" 파일에 저장합니다. 각 - 에러 로그는 파일의 새로운 줄에 기록되어야 합니다.
        - 분석 결과 출력: 에러 로그의 총 개수와 함께 사용자에게 분석이 완료되었음을 알립니다.
*/

        try {

            Reader reader = new FileReader("src/io_stream/server.log");
            Writer writer = new FileWriter("src/io_stream/errorLogs.txt");

            findError(reader, writer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void findError(Reader reader, Writer writer) {

        try (BufferedReader br = new BufferedReader(reader);
             BufferedWriter bw = new BufferedWriter(writer)) {

            while (true) {

                String string = br.readLine();
                if (string == null) break;

//////////////////////////////////////////////////////

                if (string.contains("ERROR")) {
                    bw.write(string);
                    bw.newLine();
                }
            }

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
