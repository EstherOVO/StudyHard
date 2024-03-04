package exception.ex04;

import java.util.Scanner;

public class Calculate {

    int count = 0;
    int result1;
    int result2;
    int result3;

    public int setAnswer() {

        Scanner scanner = new Scanner(System.in);

        int[] randoms = new int[6];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 10) + 1;
        }

        result1 = randoms[0] + randoms[1];
        result2 = randoms[2] - randoms[3];
        result3 = randoms[4] * randoms[5];

        System.out.print("Q1. " + randoms[0] + " + " + randoms[1] + " = ");
        int number1 = scanner.nextInt();

        System.out.print("Q2. " + randoms[2] + " - " + randoms[3] + " = ");
        int number2 = scanner.nextInt();

        System.out.print("Q3. " + randoms[4] + " * " + randoms[5] + " = ");
        int number3 = scanner.nextInt();

        int[] numbers = {number1, number2, number3};
        int[] results = {result1, result2, result3};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == results[i]) {
                count++;
            }
        }
        return count;
    }

    public void getResult() {
        System.out.println("▨ 정답은...\nQ1 : " + result1 + "\nQ2 : " + result2 + "\nQ3 : " + result3);
    }
}
