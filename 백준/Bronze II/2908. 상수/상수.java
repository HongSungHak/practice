import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		int num1 = Integer.parseInt(sb.append(str1).reverse().toString());
		int num2 = Integer.parseInt(sb2.append(str2).reverse().toString());
		System.out.println(num1 > num2 ? num1 : num2);
	}
}