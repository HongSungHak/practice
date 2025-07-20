import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String line = br.readLine();
            int lastIndex1 = line.length() / 2;
            int lastIndex2 = line.length() / 2 - 1;


            if (line.charAt(lastIndex1) == line.charAt(lastIndex2)) {
                System.out.println("Do-it");
            } else {
                System.out.println("Do-it-Not");
            }
        }
    }
}
