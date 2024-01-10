import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static List<Integer> list[];
	static boolean visited[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		list = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		for (int i = 1; i < N+1; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			list[start].add(end);
			list[end].add(start);
		}
		int count = 0;
		for (int i = 1; i < N+1; i++) {
			if (!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}

	private static void DFS(int n) {
		if (visited[n]) {
			return;
		}
		visited[n] = true;
		for (int i : list[n]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}
}
