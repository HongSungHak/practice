import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String text = br.readLine();
			for (int k = 0; k < text.length(); k++) {
				char c = text.charAt(k);
				arr[c - 'A'] += (int) Math.pow(10, text.length() - 1 - k);
			}
		}
		Arrays.sort(arr);
		int num = 9;
		int turn = 25;
		int ans = 0;
		while(arr[turn] != 0) {
			ans += arr[turn]*num;
			turn--;
			num--;
		}
		System.out.print(ans);
	}
}