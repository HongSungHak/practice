import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}