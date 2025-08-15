import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String password = br.readLine();
            if (password.equals("end")) {
                break;
            }
            sb.append("<").append(password).append(">");
            if (isAcceptable(password)) {
                sb.append(" is acceptable.\n");
            } else {
                sb.append(" is not acceptable.\n");
            }
        }
        System.out.print(sb);
    }

    private static boolean isAcceptable(String password) {
        boolean hasVowel = false;
        int consecutiveVowels = 0;
        int consecutiveConsonants = 0;

        String vowels = "aeiou";

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            boolean isVowel = vowels.indexOf(currentChar) != -1;

            if (isVowel) {
                hasVowel = true;
                consecutiveVowels++;
                consecutiveConsonants = 0;
            } else {
                consecutiveConsonants++;
                consecutiveVowels = 0;
            }

            // 규칙 2: 모음 또는 자음이 3개 연속으로 오는지 검사
            if (consecutiveVowels >= 3 || consecutiveConsonants >= 3) {
                return false;
            }

            // 규칙 3: 같은 글자가 연속으로 두 번 오는지 검사 (ee, oo 제외)
            if (i > 0 && currentChar == password.charAt(i - 1)) {
                if (currentChar != 'e' && currentChar != 'o') {
                    return false;
                }
            }
        }

        // 규칙 1: 모음이 하나라도 포함되어 있는지 검사
        if (!hasVowel) {
            return false;
        }

        return true;
    }
}