import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> seenStrings = new HashSet<>();
        String foundPalindrome = "";

        for (int i = 0; i < N; i++) {
            String currentWord = br.readLine();
            String reversedWord = new StringBuilder(currentWord).reverse().toString();

            if (currentWord.equals(reversedWord)) {
                foundPalindrome = currentWord;
                break;
            }

            if (seenStrings.contains(reversedWord)) {

                foundPalindrome = currentWord;
                break;
            }

            seenStrings.add(currentWord);
        }

        if (!foundPalindrome.isEmpty()) {
            int length = foundPalindrome.length();
            char middleChar = foundPalindrome.charAt(length / 2);
            System.out.println(length + " " + middleChar);
        }
    }
}