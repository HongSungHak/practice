import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); 

        int requiredO = (N + 1) / 2;

        int countO = 0;
        String s = br.readLine(); 
        for (char c : s.toCharArray()) {
            if (c == 'O') {
                countO++;
            }
        }

        if (countO >= requiredO) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}