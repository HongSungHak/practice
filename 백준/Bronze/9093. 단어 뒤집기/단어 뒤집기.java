import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        StringBuilder sb;
        for (int i = 0; i < N; i++) {
            sb = new StringBuilder();
            char[] charArray = br.readLine().toCharArray();
            for (char c : charArray) {
                if (c != ' ') {
                    stack.push(c);
                } else {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                }
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            System.out.println(sb);
        }
    }
}