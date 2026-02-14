import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("");
        String[] M = br.readLine().split("");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N.length; i++) {
            map.put(N[i], map.getOrDefault(N[i], 0) + 1);
        }
        for (int i = 0; i < M.length; i++) {
            map.put(M[i], map.getOrDefault(M[i], 0) - 1);
        }
        int result = 0;
        for (String s : map.keySet()) {
            result += Math.abs(map.get(s));
        }
        System.out.println(result);
    }
}