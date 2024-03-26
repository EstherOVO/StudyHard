package io_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

/*
        문제 : 텍스트 기반 채팅 로그 분석기

        문제 설명 :
        채팅 애플리케이션의 로그 파일을 분석하는 프로그램을 작성해야 합니다.
        이 프로그램은 주어진 텍스트 파일 형식의 채팅 로그에서 각 사용자별로 메시지를 얼마나 보냈는지 분석하여
        결과를 "chatSummary.txt" 파일에 저장해야 합니다.

        요구사항 :
        - 로그 파일 형식 : "chat.log" 로그 파일은 각 줄마다 하나의 메시지를 기록하며
        각 메시지는 다음 형식을 따릅니다 : [시간] 사용자명 : 메시지
        - 결과 파일 : "chatSummary.txt" 파일에는 각 사용자별로 보낸 메시지의 총 개수를 기록합니다.
        사용자별로 한 줄에 기록하며, 형식은 다음과 같습니다 : 사용자명 : 메시지 개수

        chat.log
        ===
        [08:45] 길동씨 : 좋은 아침이에요!
        [08:47] 무대리 : 모두 좋은 아침입니다.
        [08:49] 박진수 : 오늘 회의 시간에 늦지 않게 출발해야겠어요.
        [08:50] 길동씨 : 네, 안전하게 오세요.
        [09:00] 박진수 : 저도 도착했습니다. 회의실 어디에요?
        [09:01] 강감찬 : 2층 회의실 3번입니다.
        [09:03] 길동씨 : 아, 커피 한잔 마시고 올라갈게요. 누구 커피 드릴까요?
        [09:04] 무대리 : 저는 아메리카노 부탁드립니다.
        [09:05] 박진수 : 저는 라떼로 부탁드려요. 감사합니다!
        [09:07] 강감찬 : 저도 아메리카노로 해주세요.
        [09:10] 길동씨 : 알겠습니다. 잠시 후에 회의실에서 뵐게요.
        [09:15] 무대리 : 모두 회의 준비는 잘 되어가나요?
        [09:17] 박진수 : 네, 거의 다 준비된 것 같아요.
        [09:20] 길동씨 : 커피 다 준비했습니다. 회의 시작해요!

        chatSummary.txt
        ===
        박진수 : 4
        길동씨 : 5
        무대리 : 3
        강감찬 : 2
*/

        try {

            Reader reader = new FileReader("src/io_stream/chat.log");
            Writer writer = new FileWriter("src/io_stream/chatSummary.txt");

            countFrequency(reader, writer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void countFrequency(Reader reader, Writer writer) {

        try (BufferedReader br = new BufferedReader(reader);
             BufferedWriter bw = new BufferedWriter(writer)) {

            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;

            while (true) {

                String string = br.readLine();
                if (string == null) break;

//////////////////////////////////////////////////////

                if (string.contains("박진수")) {
                    count1++;
                } else if (string.contains("길동씨")) {
                    count2++;
                } else if (string.contains("무대리")) {
                    count3++;
                } else if (string.contains("강감찬")) {
                    count4++;
                }

            }

            bw.write("박진수 : " + count1 + "번");
            bw.newLine();
            bw.write("길동씨 : " + count2 + "번");
            bw.newLine();
            bw.write("무대리 : " + count3 + "번");
            bw.newLine();
            bw.write("강감찬 : " + count4 + "번");

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
