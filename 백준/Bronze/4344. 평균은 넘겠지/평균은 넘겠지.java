import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] arr;
        for (int i = 0; i < inputNum; i++) {
            int roofNum = sc.nextInt();
            arr = new int[roofNum];
            //성적 입력부분
            for (int j = 0; j < roofNum; j++) {
                arr[j] = sc.nextInt();
            }
            double avgScore = Arrays.stream(arr).average().getAsDouble();
            double count = Arrays.stream(arr).filter(score -> score > avgScore).count();
            System.out.printf("%.3f%%\n",(count/roofNum) * 100);
        }
    }
}