import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int key = sc.nextInt();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int key = sc.nextInt();
            System.out.print(map.getOrDefault(key, 0) + " ");
        }
    }
}