import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 
        
        int testCase = Integer.parseInt(br.readLine());
        
        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine()); 
            
            Deque<int[]> dq = new ArrayDeque<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 

            for (int i = 0; i < N; i++) {
                int importance = Integer.parseInt(st.nextToken());
                dq.add(new int[]{i, importance}); 
                pq.add(importance);
            }

            int printCount = 0;
            
            while (!dq.isEmpty()) {
                int[] current = dq.poll();
                
                if (current[1] == pq.peek()) {
                    pq.poll(); 
                    printCount++;
                    
                    if (current[0] == M) {
                        sb.append(printCount).append('\n');
                        break; 
                    }
                } else {
                    dq.add(current);
                }
            }
        }
        System.out.print(sb);
    }
}