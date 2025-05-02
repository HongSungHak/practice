import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dasom = sc.nextInt();

        PriorityQueue<Integer> others = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i < N; i++) {
            others.add(sc.nextInt());
        }

        int bribeCount = 0;

        while (!others.isEmpty() && others.peek() >= dasom) {
            int maxVote = others.poll();
            maxVote--;
            dasom++;
            bribeCount++;

            others.add(maxVote);
        }

        System.out.println(bribeCount);
    }
}
