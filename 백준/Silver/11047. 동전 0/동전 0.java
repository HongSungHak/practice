import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int moneyAmount = Integer.parseInt(st.nextToken());
		int targetMoney = Integer.parseInt(st.nextToken());
		int[] arr = new int[moneyAmount];

		for (int i = 0; i < moneyAmount; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int count = 0;

		for(int i = moneyAmount - 1; i >= 0; i--) {
			if(arr[i] <= targetMoney) {
				count += (targetMoney / arr[i]);
				targetMoney = targetMoney % arr[i];
			}
		}
		System.out.println(count);
	}
}