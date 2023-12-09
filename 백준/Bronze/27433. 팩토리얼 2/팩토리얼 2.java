import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(factorial(N));
    }
    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}