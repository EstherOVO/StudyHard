package interface00.ex01;

public class CDPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("CD Player를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("CD Player 재생을 일시 정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("CD Player 재생을 멈춥니다.");
    }
}
