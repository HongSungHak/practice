import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int n, k;
    static String[] cards;
    static boolean[] visited;
    static Set<String> results = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        cards = new String[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.next();
        }

        dfs("", 0);

        System.out.println(results.size());
    }

    static void dfs(String current, int depth) {
        if (depth == k) {
            results.add(current);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(current + cards[i], depth + 1);
                visited[i] = false;
            }
        }
    }
}
