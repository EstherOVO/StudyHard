package nested.anonymous.ex06;

public class Ex06 {
    public static void main(String[] args) {

/*
        문제 6. 익명 활용 02

        다음 메인 메소드의 실행결과를 출력하는 Vehicle 클래스와 Anonymous 클래스를
        익명 인터페이스 구현 객체를 이용하여 만들어주세요.

        public class Main {
            public static void main(String[] args) {
                Anonymous anony = new Anonymous();
                //익명 객체 필드 사용
                anony.field.run();
                //익명 객체 로컬변수 사용
                anony.method1();
                //익명 객체 매개값 사용
                anony.method2( // 입력값을 넣어주세요. );
            }
        }

        실행 결과 :
        자전거가 달립니다.
        승용차가 달립니다.
        트럭이 달립니다.
*/

        Anonymous anonymous = new Anonymous();

        anonymous.vehicleField.drive();

        anonymous.method1();

        anonymous.method2(new Vehicle() {

            public void eat() {
                System.out.println("점심을 먹습니다.");
            }

            @Override
            public void drive() {
                System.out.println("트럭이 달립니다.");
                eat();
            }
        });
    }
}
