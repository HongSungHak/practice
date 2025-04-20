import java.util.Scanner;

public class Main {
    static int[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        memo = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            memo[i] = -1;
        }
        int result = fibonacci(num);
        System.out.println(result);
    }
    private static int fibonacci(int num) {
        if (num <= 1) return num;
        if (memo[num] != -1) return memo[num];
        memo[num] = fibonacci(num - 1) + fibonacci(num - 2);
        return memo[num];
    }
}
