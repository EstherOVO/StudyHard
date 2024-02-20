package method;

import java.util.Scanner;

public class MethodEx01 {
    public static void main(String[] args) {

//      단어 배열 만들기
        String[] words = {"red", "orange", "yellow", "green", "blue", "navy", "purple"};
        String selectedWord = words[(int) (Math.random() * words.length)];

//      각 단어 자리에 '_'가 들어가게 하기
        char[] displayArray = new char[selectedWord.length()];
        for (int i = 0; i < displayArray.length; i++) {
            displayArray[i] = '_';
        }

//      도전 횟수 정하기
        int tries = 0;
        final int maxTries = 7;

        Scanner scanner = new Scanner(System.in);

        while (tries < maxTries) {  // "최대 도전 횟수를 넘지 않는 선에서 반복하겠다."라는 의미
            System.out.print("추측 글자 : ");
            printDisplayArray(displayArray);
            String guess = scanner.nextLine();  // 추측 글자 입력받기
            if (guess.length() != 1) {  // "만약 추측 글자의 길이가 1이 아니라면 →
                System.out.println("한 글자만 입력해 주세요!");   // 이 문구를 출력하겠다."라는 의미
                continue;
            }

            char guessLetter = guess.charAt(0); // 입력받은 guess를 담을 char 바구니
            boolean isCorrectWord = false;      // false인 이유 :

            for (int k = 0; k < selectedWord.length(); k++) {   // "랜덤으로 뽑힌 단어의 글자 수만큼 반복하겠다."라는 의미
                if (guessLetter == selectedWord.charAt(k)) {    // "계속 반복하던 중 만약 입력받은 글자가 뽑힌 단어의 글자가 동일하다면 →
                    displayArray[k] = guessLetter;  // 화면에 입력받은 글자를 넣겠다.('_'가 입력받은 글자로 변경)"라는 의미
                    isCorrectWord = true;
                }
            }
            if (!isCorrectWord) {
                tries++;    // 틀릴 때마다 도전 횟수 하나씩 올리기
                System.out.println("틀렸습니다. 남은 도전 횟수는 " + (maxTries - tries) + "회입니다.");
            }
        }
    }

// 현재까지 맞춘 단어의 상태를 출력하는 메소드 → 예시) 답이 "java"일 경우 : "j _ _ _"를 출력
    private static void printDisplayArray(char[] displayArray) {
        for (char c : displayArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
