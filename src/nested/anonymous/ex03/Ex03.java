package nested.anonymous.ex03;

public class Ex03 {
    public static void main(String[] args) {

/*
        문제 3. Tire와 Engine 중첩 멤버 클래스 객체 생성

        Tire와 Engine이 멤버 클래스로 선언이 되어있습니다.
        Main 클래스를 생성하여 멤버 클래스의 객체를 생성하는 코드를 작성해 주세요.
        public class Car {
            class Tire {}
            static class Engine {}
        }
*/

        Car car = new Car();
        Car.Tire tire = car.new Tire();

        Car.Engine engine = new Car.Engine();
    }
}
