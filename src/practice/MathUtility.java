package practice;

public class MathUtility {

/*
    MathUtility 클래스 :
    static 메소드로 최대값을 찾는 max(int a, int b) 메소드를 구현합니다.
    static 메소드로 최소값을 찾는 min(int a, int b) 메소드를 구현합니다.
    static 메소드로 두 수의 합을 계산하는 sum(int a, int b) 메소드를 구현합니다.
    static 메소드로 팩토리얼을 계산하는 factorial(int n) 메소드를 구현합니다. 팩토리얼은 n!로 표현되며, 0! = 1입니다.

    Main 클래스 :
    MathUtility 클래스의 메소드들을 호출하여 그 결과를 출력합니다

        public static void main(String[] args) {
            System.out.println("Max of 10, 20: " + MathUtility.max(10, 20));
            System.out.println("Min of 10, 20: " + MathUtility.min(10, 20));
            System.out.println("Sum of 10, 20: " + MathUtility.sum(10, 20));
            System.out.println("Factorial of 5: " + MathUtility.factorial(5));
        }

    실행 결과
    ===
    Max of 10, 20 : 20
    Min of 10, 20 : 10
    Sum of 10, 20 : 30
    Factorial of 5 : 120
*/

    private int a;
    private int b;
    private int n;

    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        }
        return max;
    }

    public static int min(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else if (b < a) {
            min = b;
        }
        return min;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1 ; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
