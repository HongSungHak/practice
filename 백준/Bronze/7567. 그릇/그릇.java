import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dish = br.readLine();
        Stack<Character> stack = new Stack<>();

        int length = 0;

        for (char c : dish.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                length += 10;
            } else if (stack.peek() == c) {
                stack.push(c);
                length += 5;
            } else {
                stack.push(c);
                length += 10;
            }
        }
        System.out.println(length);
    }
}
