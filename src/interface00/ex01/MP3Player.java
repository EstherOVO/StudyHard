package interface00.ex01;

public class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3 Player를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("MP3 Player 재생을 일시 정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player 재생을 멈춥니다.");
    }
}
