import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());

        while (P-- > 0) {
            StringBuilder sb = new StringBuilder(); 
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            sb.append(A).append(" & ").append(B).append(" are ");

            if (A.length() != B.length()) {
                sb.append("NOT anagrams.");
                System.out.println(sb);
                continue; 
            }

            int[] arr = new int[26];
            for (int i = 0; i < A.length(); i++) {
                arr[A.charAt(i) - 'a']++; 
                arr[B.charAt(i) - 'a']--; 
            }

            boolean isAnagram = Arrays.stream(arr).allMatch(num -> num == 0); 
            sb.append(isAnagram ? "anagrams." : "NOT anagrams.");
            System.out.println(sb);
        }
    }
}