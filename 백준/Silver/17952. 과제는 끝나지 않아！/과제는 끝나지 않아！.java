import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Assignment {
    int score;
    int time;

    Assignment(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Assignment> stack = new Stack<>();
        int totalScore = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
               
                int A = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken()); 

                stack.push(new Assignment(A, T));
            }

            if (!stack.isEmpty()) {
                Assignment currentTask = stack.peek(); 
                currentTask.time--; 

                if (currentTask.time == 0) {
                    totalScore += currentTask.score;
                    stack.pop();
                }
            }
        }
        System.out.println(totalScore);
    }
}