import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int inputNum = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        int[] array = IntStream.rangeClosed(1, inputNum).filter(i -> inputNum % i == 0).toArray();
        if (array.length <= j - 1) {
            System.out.println(0);
        } else {
            System.out.println(array[j - 1]);
        }
    }
}