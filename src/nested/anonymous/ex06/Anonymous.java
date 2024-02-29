package nested.anonymous.ex06;

public class Anonymous {

    Vehicle vehicleField = new Vehicle() {

        public void exercise() {
            System.out.println("운동을 합니다.");
        }

        @Override
        public void drive() {
            System.out.println("자전거가 달립니다.");
            exercise();
        }
    };

    public void method1() {

        Vehicle vehicleLocal = new Vehicle() {

            public void work() {
                System.out.println("일을 합니다.");
            }

            @Override
            public void drive() {
                System.out.println("승용차가 달립니다.");
                work();
            }
        };

        vehicleLocal.drive();
    }

    public void method2(Vehicle vehicle) {
        vehicle.drive();
    }
}
