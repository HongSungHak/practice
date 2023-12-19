import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String inputWord = br.readLine();
        for (int i = 0; i < inputWord.length(); i++) {
            if (inputWord.charAt(i) == 'a' || inputWord.charAt(i) == 'e' || inputWord.charAt(i) == 'o' || inputWord.charAt(i) == 'i' || inputWord.charAt(i) == 'u')
                count ++;
        }
        System.out.println(count);
    }
}