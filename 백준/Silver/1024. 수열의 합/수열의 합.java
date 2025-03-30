import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int L = sc.nextInt();

        for (int i = L; i <= 100; i++) {
            long numerator = N - (long)(i - 1) * i / 2;

            if (numerator < 0) break; 

            if (numerator % i == 0) {  
                long x = numerator / i; 
                if (x >= 0) { 
                    for (int j = 0; j < i; j++) {
                        System.out.print((x + j) + " ");
                    }
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
