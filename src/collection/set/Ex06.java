package collection.set;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

public class Ex06 {

/*
        연습문제 6. 회의실 예약 시스템

        온라인 회의실 예약 시스템을 구현해 봅니다.
        이 시스템은 회의실 예약 요청들을 시간 순으로 관리하며, 중복된 시간에 대한 예약을 방지합니다.
        각 예약 요청은 시작 시간과 종료 시간으로 구성되며, TreeSet을 사용하여 예약들을 관리합니다.

        요구사항 :
        Reservation 클래스 정의
        - 필드: 예약 시간(LocalDateTime start), 예약자명(String name), 장소(String place)
        - 생성자: 시작 시간과 종료 시간을 매개변수로 받아 초기화
        - Comparable<Reservation> 인터페이스 구현: 시작 시간을 기준으로 오름차순 정렬

        입력예시: 예약 요청 정보(정확한 시작 시간)
        ===
        예약1: 2023년 10월 10일 12시 00분 시작
        예약2: 2023년 10월 10일 10시 00분 시작
        예약3: 2023년 10월 11일 10시 00분 시작
        예약4: 2023년 10월 10일 15시 00분 시작


        출력예시: 예약 목록 출력
        ===
        "예약 시간: 2023-10-10T10:00, 회의실, 김길동"
        "예약 시간: 2023-10-10T12:00, 회의실, 홍길동"
        "예약 시간: 2023-10-10T15:00, 회의실, 홍길서"
        "예약 시간: 2023-10-11T10:00, 회의실, 홍길남"
*/

    public static class Reservation implements Comparable<Reservation> {

        LocalDateTime startTime;
        int usingHours;
        int usingMinutes;
        String name;
        String place;

        public Reservation(LocalDateTime startTime, int usingHours, int usingMinutes, String name, String place) {
            this.startTime = startTime;
            this.usingHours = usingHours;
            this.usingMinutes = usingMinutes;
            this.name = name;
            this.place = place;
        }

        @Override
        public int compareTo(Reservation reservation) {
            return startTime.compareTo(reservation.startTime);
        }

        public String toString() {
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 mm분");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("a h시 mm분");
            return "■ 예약자 : " + name + " | ■ 예약장소 : " + place +
                    " | ■ 예약일정 : " + formatter1.format(startTime) +
                    "(종료시간 : " + formatter2.format(startTime.plusHours(usingHours).plusMinutes(usingMinutes)) + ")";

        }
    }
    public static void main(String[] args) {

        Reservation reservation1 = new Reservation(LocalDateTime.of(2024, 3, 13, 10, 00), 2, 30, "홍길동", "중앙 회의실");
        Reservation reservation2 = new Reservation(LocalDateTime.of(2024, 3, 13, 17, 40), 2, 00, "오뚜기", "중앙 회의실");
        Reservation reservation3 = new Reservation(LocalDateTime.of(2024, 3, 13, 14, 30), 2, 50, "임꺽정", "중앙 회의실");
        Reservation reservation4 = new Reservation(LocalDateTime.of(2024, 3, 13, 13, 00), 1, 20, "김자바", "중앙 회의실");

        TreeSet<Reservation> treeSet = new TreeSet<>();

        treeSet.add(reservation1);
        treeSet.add(reservation2);
        treeSet.add(reservation3);
        treeSet.add(reservation4);

        for (Reservation reservation : treeSet) {
            System.out.println(reservation);
        }
    }
}
