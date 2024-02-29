package nested.anonymous.ex05;

public class Anonymous {

    Worker workerField = new Worker() {

        public void study() {
            System.out.println("공부를 합니다.");
        }

        @Override
        public void work() {
            System.out.println("디자인을 합니다.");
            study();
        }
    };

    public void method1() {
        Worker workerLocal = new Worker() {

            public void sleep() {
                System.out.println("잠을 잡니다.");
            }

            @Override
            public void work() {
                System.out.println("개발을 합니다.");
                sleep();
            }
        };

        workerLocal.work();
    }

    public void method2(Worker worker) {
        worker.work();
    }
}
