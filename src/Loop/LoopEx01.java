package Loop;

public class LoopEx01 {
    public static void main(String[] args) {

//      반복문을 이용해서 20 이내의 짝수를 출력해 주세요.

        System.out.print("1 ~ 20 이내의 짝수 :" );
        for (int even = 1; even <=20; even++) {
            if (even % 2 == 0) {
                System.out.print(" " + even);
            }
        }

    }
}
