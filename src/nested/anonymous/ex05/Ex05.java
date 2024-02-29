package nested.anonymous.ex05;

public class Ex05 {
    public static void main(String[] args) {

/*
        문제 5. 익명 활용 01

        다음 메인 메소드의 실행 결과를 출력하는 Worker 클래스와 Anonymous 클래스를
        익명 자식 객체를 이용하여 만들어주세요.

        public class Main {
            public static void main(String[] args) {
                Anonymous anony = new Anonymous();

                anony.field.start();

                anony.method1();

                anony.method2(
                    new Worker() {
                        @Override
                        public void start() {
                            System.out.println("테스트를 합니다.");
                        }
                    }
                );
            }
        }

        실행 결과 :
        디자인을 합니다.
        개발을 합니다.
        테스트를 합니다.
*/

        Anonymous anony = new Anonymous();

        anony.workerField.work();

        anony.method1();

        anony.method2(new Worker() {

            public void eat() {
                System.out.println("밥을 먹습니다.");
            }

            @Override
            public void work() {
                System.out.println("테스트를 합니다.");
                eat();
            }
        });


    }
}
