package static00;

public class MathUtility {

    int a;
    int b;
    int n;

    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int min(int a, int b) {
        int min = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        return min;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
