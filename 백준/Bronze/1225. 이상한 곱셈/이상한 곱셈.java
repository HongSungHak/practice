import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1 = st.nextToken();
        String num2 = st.nextToken();
        long sum = 0; 
        for (int i = 0; i < num1.length(); i++) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = 0; j < num2.length(); j++) {
                int digit2 = num2.charAt(j) - '0';
                sum += (long) digit1 * digit2;
            }
        }
        System.out.println(sum);
    }
}
