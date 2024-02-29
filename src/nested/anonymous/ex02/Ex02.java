package nested.anonymous.ex02;

public class Ex02 {
    public static void main(String[] args) {

/*
        문제 2. 이벤트 리스너 구현

        버튼 클릭 이벤트를 처리하는 익명 객체를 만드세요.
        Button 클래스와 OnClickListener 인터페이스가 주어져 있다고 가정합니다.
        OnClickListener 인터페이스에는 void onClick() 메소드가 있습니다.
        버튼 클릭 시 "버튼이 클릭되었습니다!"를 출력하도록 구현하세요.
*/

        Button button = new Button();

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다!");
            }
        });

        button.touch();
    }
}
