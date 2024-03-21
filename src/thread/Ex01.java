package thread;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {

/*
        연습문제 : 경주 게임 시뮬레이션

        요구사항 :
        3대의 차량(스레드)이 경주를 합니다.
        각 차량은 출발 후 랜덤하게 0 ~ 1초 사이에 한 번씩 "차량 [번호]가 질주 중!" 메시지를 5번 출력한 후, 경주를 마칩니다.

        출력 예시 :
        차량 1이 질주 중!
        차량 2이 질주 중!
        차량 3이 질주 중!
        차량 1이 질주 중!
        차량 3이 질주 중!
        ...
        차량 3이 경주 마침!
        차량 1이 경주 마침!
        차량 2이 경주 마침!
*/

        Thread car1 = new Thread(new MyCar("원 넘버"));
        Thread car2 = new Thread(new MyCar("투 넘버"));
        Thread car3 = new Thread(new MyCar("쓰리 넘버"));

        car1.start();
        car2.start();
        car3.start();
    }

    public static class MyCar implements Runnable {

        private String name;

        public MyCar(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            System.out.println(name + " 차량이 출발하였습니다!");

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(new Random().nextInt(1000, 2000));
                    System.out.println(String.format("%s 차량이 %dm를 달렸습니다.", name, (i + 1) * 100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(name + " 차량이 결승선에 도착했습니다!");
        }
    }

}
