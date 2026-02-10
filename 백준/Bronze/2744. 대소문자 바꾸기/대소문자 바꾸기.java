import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine().chars().map(alphabet -> {
                    if (alphabet >= 65 && alphabet <= 90) {
                        return alphabet + 32;
                    } else {
                        return alphabet - 32;
                    }
                }).collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        System.out.println(result);
    }
}