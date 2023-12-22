import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (arr[index] == -1) {
                arr[index] = i;
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}