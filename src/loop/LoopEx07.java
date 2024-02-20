package loop;

import java.util.Scanner;

public class LoopEx07 {
    public static void main(String[] args) {

//      이름과 나이를 입력받고 출력하는 애플리케이션

        Scanner scanner = new Scanner(System.in);

        boolean runApp = true;

        while (runApp) {
            System.out.print("이름을 입력하세요(\'q\' 입력 시 종료) : ");
            String userName = scanner.nextLine();
            if (userName.equals("q")) {
                System.out.println("종료합니다.");
                runApp = false;
                break;
            }
            System.out.print("나이를 입력하세요(\'q\' 입력 시 종료) : ");
            String userAge = scanner.nextLine();
            if (userAge.equals("q")) {
                System.out.println("종료합니다.");
                runApp = false;
                break;
            }
            System.out.println(userName + "님은 " + userAge + "세 입니다.");
        }

    }
}
