import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr = new int[5];
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			int deplane = Integer.parseInt(st.nextToken());
			int onboard = Integer.parseInt(st.nextToken());
			arr[i + 1] = arr[i] + onboard - deplane;
		}
		System.out.println(Arrays.stream(arr).max().getAsInt());
	}
}