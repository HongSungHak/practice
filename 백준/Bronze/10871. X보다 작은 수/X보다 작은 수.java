import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int compareNum = sc.nextInt();
        int[] arr = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.stream(arr).filter(i -> i < compareNum).forEach(i -> System.out.print(i + " "));
    }
}