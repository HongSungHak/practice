import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static Deque dq;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		dq = new ArrayDeque();
		for (int i = 0; i < inputNum; i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "1" : dq.addFirst(Integer.parseInt(st.nextToken())); break;
				case "2" : dq.addLast(Integer.parseInt(st.nextToken())); break;
				case "3" : sb.append(!dq.isEmpty() ? dq.removeFirst() : -1).append("\n"); break;
				case "4" : sb.append(!dq.isEmpty() ? dq.removeLast() : -1).append("\n"); break;
				case "5" : sb.append(dq.size()).append("\n"); break;
				case "6" : sb.append(dq.isEmpty() ? 1 : 0).append("\n"); break;
				case "7" : sb.append(!dq.isEmpty() ? dq.getFirst() : -1).append("\n"); break;
				case "8" : sb.append(!dq.isEmpty() ? dq.getLast() : -1).append("\n"); break;
			}
		}
		System.out.println(sb);
	}
}