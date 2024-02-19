package Class;

import java.util.Scanner;

public class Person_Ex02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정보를 입력하실 총인원을 말씀해 주세요 : ");
        int number = scanner.nextInt();

        Person[] people = new Person[number];

        for (int i = 0; i < number; i++) {
            System.out.println("= 정보를 입력해 주세요 =");
            System.out.print("▷ 이름 : ");
            String name = scanner.next();

            System.out.print("▷ 나이 : ");
            int age = scanner.nextInt();

            System.out.print("▷ 성별 : ");
            String gender = scanner.next();

            people[i] = new Person(name, age, gender);
        }

        System.out.println("▽ 입력하신 정보를 확인해 주세요. ▽");
        for (int j = 0; j < people.length; j++) {
            people[j].printInfo();
            if (j != people.length - 1) {
                System.out.println("===========");
            }
        }
    }
}
