import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int inputNum2 = sc.nextInt();
        int[][] arr = new int[inputNum][inputNum2];
        int[][] arr2 = new int[inputNum][inputNum2];
        int[][] result = new int[inputNum][inputNum2];
        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum2; j++) {
                System.out.print(arr[i][j] + arr2[i][j] + " ");
                if (j == inputNum2 - 1) {
                    System.out.println();
                }
            }
        }

    }
}