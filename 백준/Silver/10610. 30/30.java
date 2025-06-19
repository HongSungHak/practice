import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        // 숫자 배열로 변환
        char[] digits = n.toCharArray();
        int sum = 0;
        boolean hasZero = false;

        for (char c : digits) {
            int digit = c - '0';
            sum += digit;
            if (digit == 0) hasZero = true;
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println("-1");
            return;
        }

        // 내림차순 정렬
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits));
        System.out.println(sb.reverse().toString());
    }
}
