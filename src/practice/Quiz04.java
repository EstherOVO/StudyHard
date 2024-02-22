package practice;

public class Quiz04 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};

        System.out.print("모든 배열 : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == arr.length - 1 && j == arr[i].length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("\nsum : " + sum);
    }
}
