import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		StringBuilder reversed = sb.append(input).reverse();
		System.out.println(input.equals(reversed.toString()) ? 1 : 0);
	}
}