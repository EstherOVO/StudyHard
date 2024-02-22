package practice;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) * 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("어떤 숫자를 입력하시겠습니까? ");
        int guessNumber = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (guessNumber < randomNumber) {
                System.out.println("업");
                guessNumber = scanner.nextInt();
            } else if (guessNumber > randomNumber) {
                System.out.println("다운");
                guessNumber = scanner.nextInt();
            } else if (guessNumber == randomNumber) {
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
