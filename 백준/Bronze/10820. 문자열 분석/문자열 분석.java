import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int[] arr = new int[4]; // [소문자, 대문자, 숫자, 공백]

            for (char ch : line.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    arr[0]++;
                } else if (ch >= 'A' && ch <= 'Z') {
                    arr[1]++;
                } else if (ch >= '0' && ch <= '9') {
                    arr[2]++;
                } else if (ch == ' ') {
                    arr[3]++;
                }
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
