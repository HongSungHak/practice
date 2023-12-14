import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        while (q.size() != 1) {
            Integer a = q.poll();
            Integer b = q.poll();
            q.add(b);
        }
        System.out.println(q.peek());
    }
}