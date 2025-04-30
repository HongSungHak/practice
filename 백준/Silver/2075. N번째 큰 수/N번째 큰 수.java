import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N * N; i++) {
            int num = sc.nextInt();
            minHeap.add(num);
            if (minHeap.size() > N) {
                minHeap.poll(); 
            }
        }

        System.out.println(minHeap.peek()); 
    }
}
