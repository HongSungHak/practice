import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int count = 0;
            String inputString = br.readLine().toLowerCase();
            if (inputString.equals("#")) break;
            for (int i = 0; i < inputString.length(); i++) {
                switch (inputString.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'o':
                    case 'u':
                    case 'i':
                        count++;
                    default: break;
                }
            }
            System.out.println(count);
        }
    }
}