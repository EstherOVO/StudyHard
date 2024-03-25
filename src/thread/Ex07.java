package thread;

import java.util.Arrays;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        List<String> customerList = Arrays.asList("둘리", "철수", "영희", "희동", "길동");

        customerList.stream()
                .forEach(customer -> new Thread(new Customer(cafe), customer).start());

        Thread manager = new Thread(new Manager(cafe));
        manager.start();


    }

    public static class Cafe {

        final int CUP_MAX = 10;
        int cups = CUP_MAX;

        public synchronized void takeOut() throws InterruptedException {

            while (cups <= 0) {

                System.out.println(String.format("[%d개] %s : 커피 컵이 모자랍니다.", cups, Thread.currentThread().getName()));

                wait();
            }

            Thread.sleep(1000);

            System.out.println(String.format("[%d개] %s : 테이크아웃 합니다~", cups, Thread.currentThread().getName()));

            cups--;

            notifyAll();

            wait();
        }

        public synchronized void fill() throws InterruptedException {

            while (cups > 3) {

                System.out.println(String.format("[%d개] 매니저 : 커피 컵 여유 있습니다.", cups));

                wait();
            }

            Thread.sleep(1000);

            System.out.println(String.format("[%d개] 매니저 : 커피 컵 채워넣습니다.", cups));
            cups = CUP_MAX;

            notifyAll();

            wait();
        }
    }

    public static class Customer implements Runnable {

        Cafe cafe;

        public Customer(Cafe cafe) {
            this.cafe = cafe;
        }

        @Override
        public void run() {

            while (true) {

                try {
                    cafe.takeOut();
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static class Manager implements Runnable {

        Cafe cafe;

        public Manager(Cafe cafe) {
            this.cafe = cafe;
        }

        @Override
        public void run() {

            while (true) {

                try {
                    cafe.fill();
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
