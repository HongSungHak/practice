import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int preNum = 0;
        int sum = 0;
        for (int i = 0 ; i < N; i++) {
            sum += preNum + arr[i];
            preNum += arr[i];
        }
        System.out.println(sum);
    }
}