import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        int ballLocation = 1;

        for (int i = 0; i < M; i++) {
            ballLocation = getBallLocation(br, ballLocation);
        }
        System.out.println(ballLocation);
    }

    private static int getBallLocation(BufferedReader br, int ballLocation) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        if (ballLocation == X) {
            ballLocation = Y;
        }
        else if (ballLocation == Y) {
            ballLocation = X;
        }
        return ballLocation;
    }
}