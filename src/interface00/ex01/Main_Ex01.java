package interface00.ex01;

public class Main_Ex01 {
    public static void main(String[] args) {

/*
        문제 1.

        Playable 인터페이스를 정의하세요.
        이 인터페이스에는 play, pause, stop 메소드가 선언되어야 합니다.
        각 메소드는 반환 값이 없고, 매개변수도 받지 않습니다.

        MP3Player와 CDPlayer 두 개의 클래스를 정의하세요.
        이 클래스들은 Playable 인터페이스를 구현해야 합니다.
        각 클래스에서 인터페이스의 메소드를 구현할 때, 각 기능을 수행하는 것처럼 메시지를 출력하세요.
        예를 들어, MP3Player의 play 메소드는 "MP3 재생 시작!"을 출력합니다.
        Main_Ex01 클래스에서 MP3Player와 CDPlayer 객체를 생성하고,
        각각의 메소드를 호출하여 작동을 확인하세요.

        출력 결과 :
        MP3 재생 시작!
        MP3 일시 정지!
        MP3 재생 중지!
        CD 재생 시작!
        CD 일시 정지!
        CD 재생 중지!
*/

        MP3Player mp3Player = new MP3Player();
        CDPlayer cdPlayer = new CDPlayer();

        play(mp3Player);
        pause(mp3Player);
        stop(mp3Player);

        play(cdPlayer);
        pause(cdPlayer);
        stop(cdPlayer);

        System.out.println("=====================");

        Playable[] playables = {mp3Player, cdPlayer};

        for (Playable playable : playables) {
            playable.play();
            playable.pause();
            playable.stop();
        }
    }

    public static void play(Playable playable) {
        playable.play();
    }

    public static void pause(Playable playable) {
        playable.pause();
    }

    public static void stop(Playable playable) {
        playable.stop();
    }
}
