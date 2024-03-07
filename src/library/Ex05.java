package library;

import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {

/*
        연습 문제 1 : 주사위 게임

        요구사항 :
        두 명의 플레이어가 주사위를 던져서 높은 숫자가 나오는 사람이 이기는
        간단한 주사위 게임을 만드세요. 각 플레이어는 주사위를 한 번씩 던지며,
        주사위의 결과는 1부터 6까지의 무작위 숫자입니다.
        게임 결과와 두 플레이어의 주사위 숫자를 출력하세요.

        출력 예시 :
        플레이어 1 : 4
        플레이어 2 : 6
        플레이어 2가 이겼습니다!
*/

        while (true) {

            Random random = new Random();

            int player1 = random.nextInt(1, 7);
            int player2 = random.nextInt(1, 7);

            System.out.println("▣ 첫 번째 플레이어의 주사위 눈 : " + player1);
            System.out.println("▣ 두 번째 플레이어의 주사위 눈 : " + player2);

            int max = Math.max(player1, player2);
            if (player1 == player2) {
                System.out.println("비겼습니다. 주사위를 다시 던집니다!");
                continue;
            } else if (player1 == max) {
                System.out.println("첫 번째 플레이어가 이겼습니다!");
                break;
            } else {
                System.out.println("두 번째 플레이어가 이겼습니다!");
                break;
            }
        }
    }
}
