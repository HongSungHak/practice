import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] visitors = new int[N];

        for (int i = 0; i < N; i++) {
            visitors[i] = sc.nextInt();
        }

        int currentSum = 0;
        for (int i = 0; i < X; i++) {
            currentSum += visitors[i];
        }

        int maxSum = currentSum;
        int count = 1;

        for (int i = X; i < N; i++) {
            currentSum = currentSum - visitors[i - X] + visitors[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                count = 1;
            } else if (currentSum == maxSum) {
                count++;
            }
        }

        if (maxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxSum);
            System.out.println(count);
        }
    }
}
