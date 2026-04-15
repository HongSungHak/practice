import java.io.IOException;
import java.util.*;

public class Main {
    static int[][] matrix;
    static boolean[] visited;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        matrix = new int[N+1][N+1];
        visited = new boolean[N+1];

        for (int i = 1; i <= M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            matrix[x][y] = matrix[y][x] = 1;
        }
        bfs(1);
        System.out.println(count - 1);
    }

    private static void bfs(int num) {
        visited[num] = true;
        count++;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[num][i] == 1 && !visited[i]) {
                bfs(i);
            }
        }
    }
}