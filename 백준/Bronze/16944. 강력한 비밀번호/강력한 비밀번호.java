import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] password = br.readLine().toCharArray();
        System.out.println(validatePassword(password));
    }

    private static int validatePassword(char[] password) {
        int isDigit = 1;
        int isSpecial = 1;
        int isUpper = 1;
        int isLower = 1;
        int checkLength = 1;
        if (password.length < 6) {
            checkLength = 6 - password.length;
        }
        char[] specialFont = new char[]{'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
        for (int i = 0; i < password.length; i++) {
            if (password[i] >= '0' && password[i] <= '9' && isDigit == 1) {
                isDigit = 0;
            }
            if (password[i] >= 'A' && password[i] <= 'Z' && isUpper == 1) {
                isUpper = 0;
            }
            if (password[i] >= 'a' && password[i] <= 'z' && isLower == 1) {
                isLower = 0;
            }
            for (char c : specialFont) {
                if (password[i] == c) {
                    isSpecial = 0;
                    break;
                }
            }
        }
        int missingTypes = isDigit + isSpecial + isUpper + isLower;
        int lengthDeficit = 6 - password.length;
        return Math.max(missingTypes, lengthDeficit);
    }
}
