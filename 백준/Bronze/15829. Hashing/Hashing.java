import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int hash = IntStream.range(0, N)
                .reduce(0, (acc, i) -> {
                    return acc + (int)((line.charAt(i) - 96) * Math.pow(31, i));
                });

        System.out.println(hash);
    }

}