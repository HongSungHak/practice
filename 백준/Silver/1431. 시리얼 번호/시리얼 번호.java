import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> serialNumbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            serialNumbers.add(br.readLine());
        }

        Collections.sort(serialNumbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }

                int sum1 = getSumOfDigits(s1);
                int sum2 = getSumOfDigits(s2);
                if (sum1 != sum2) {
                    return sum1 - sum2;
                }

                return s1.compareTo(s2);
            }
        });

        for (String serial : serialNumbers) {
            System.out.println(serial);
        }
    }

    private static int getSumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}