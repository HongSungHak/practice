import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new char[5][15];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] == '\0') continue;
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}