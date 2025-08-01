import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int totalScore = 0;
        int currentStreak = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int score = Integer.parseInt(st.nextToken());
            if (score == 1) {
                currentStreak++;
                
                totalScore += currentStreak;
            } else {
                currentStreak = 0;
            }
        }
        System.out.println(totalScore);
    }
}