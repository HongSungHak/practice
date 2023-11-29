import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] chr = str.toCharArray();
        System.out.println(a * (chr[2] - '0'));
        System.out.println(a * (chr[1] - '0'));
        System.out.println(a * (chr[0] - '0'));
        System.out.println(a * Integer.parseInt(str));
    }
}