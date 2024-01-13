import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = {300, 60, 10};
		StringBuilder sb = new StringBuilder();

		if (num % 10 != 0) {
			System.out.println(-1);
            return;
		}
		for (int i = 0; i < arr.length; i++) {
			int value = num / arr[i];
			num %= arr[i];
			sb.append(value + " ");
		}
		System.out.println(sb);
	}
}