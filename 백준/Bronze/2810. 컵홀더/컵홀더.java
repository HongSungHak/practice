import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        char[] T = br.readLine().toCharArray();
        int count = 2;
        for (int i = 1; i < S; i++) {
            count++;
            if (T[i] != 'S') {
                i++;
            }
        }
        if (count > S) {
            count = S;
        }
        System.out.println(count);
    }
}