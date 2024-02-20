package class00;

import java.util.Scanner;

public class Animal_Ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정보를 입력하실 동물의 수를 말씀해 주세요 : ");
        int number = scanner.nextInt();

        Animal[] animals = new Animal[number];

        for (int i = 0; i < number; i++) {
            System.out.println("= 정보를 입력해 주세요 =");
            System.out.print("▷ 종(Specie) : ");
            String specie = scanner.next();

            System.out.print("▷ 이름 : ");
            String name = scanner.next();

            System.out.print("▷ 나이 : ");
            int age = scanner.nextInt();

            animals[i] = new Animal(specie, name, age);
        }

        System.out.println("▽ 입력하신 정보를 확인해 주세요. ▽");
        for (int j = 0; j < animals.length; j++) {
            animals[j].printInfo();
            if (j != animals.length - 1) {
                System.out.println("===========");
            }
        }
    }
}
