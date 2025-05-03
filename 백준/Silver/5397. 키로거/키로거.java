import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String input = br.readLine();
            Deque<Character> left = new ArrayDeque<>();
            Deque<Character> right = new ArrayDeque<>();

            for (char ch : input.toCharArray()) {
                switch (ch) {
                    case '<':
                        if (!left.isEmpty()) {
                            right.push(left.pollLast());
                        }
                        break;
                    case '>':
                        if (!right.isEmpty()) {
                            left.addLast(right.pop());
                        }
                        break;
                    case '-':
                        if (!left.isEmpty()) {
                            left.pollLast();
                        }
                        break;
                    default:
                        left.addLast(ch);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : left) sb.append(c);
            while (!right.isEmpty()) {
                sb.append(right.pop());
            }

            System.out.println(sb);
        }
    }
}
