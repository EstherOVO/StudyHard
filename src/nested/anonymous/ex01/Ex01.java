package nested.anonymous.ex01;

public class Ex01 {
    public static void main(String[] args) {

/*
        문제 1. 간단한 인터페이스 구현

        Printable 인터페이스가 있다고 가정합니다.
        이 인터페이스에는 void print() 메소드가 정의되어 있습니다.
        Printable 인터페이스를 구현하는 익명 객체를 생성하고,
        print 메소드 내에서 "Hello, World!"를 출력하는 프로그램을 작성하세요.
*/

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello, World!");
            }
        };

        printable.print();
    }
}
