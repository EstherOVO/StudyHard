package practice;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 단부터 : ");
        int firstnumber = scanner.nextInt();

        System.out.print("몇 단까지 : ");
        int secondNumber = scanner.nextInt();

        for (int i = firstnumber; i <= secondNumber ; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <=9 ; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
