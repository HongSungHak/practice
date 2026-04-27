import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int gameSize = switch (st.nextToken()) {
            case "Y" -> 1;
            case "F" -> 2;
            default  -> 3;  
        };

        Set<String> played = new HashSet<>();
        int games = 0;
        int waiting = 0;

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (played.add(name)) {  
                waiting++;
                if (waiting == gameSize) {
                    games++;
                    waiting = 0;
                }
            }
        }

        System.out.println(games);
    }
}