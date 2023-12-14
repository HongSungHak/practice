import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        double sum = 0;
        double[] arr = new double[inputNum];
        for (int i = 0; i < inputNum; i++) {
            arr[i] = sc.nextInt();
        }
        double maxNum = Arrays.stream(arr).max().getAsDouble();
        for (int i = 0; i < inputNum; i++) {
            sum += arr[i] * 100 / maxNum;
        }
        System.out.println(sum / inputNum);
    }
}