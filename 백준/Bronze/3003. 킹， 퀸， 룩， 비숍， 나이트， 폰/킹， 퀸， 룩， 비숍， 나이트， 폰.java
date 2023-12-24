import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputWhitePiece = br.readLine().split(" ");
        int[] lackPiece = Arrays.stream(inputWhitePiece).mapToInt(Integer::parseInt).toArray();
        int[] whitePiece = {1, 1, 2, 2, 2, 8};
        IntStream.range(0, lackPiece.length).map(i -> whitePiece[i] - lackPiece[i]).forEach(i -> System.out.print(i + " "));
    }
}