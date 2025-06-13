import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 입력받을 금액
        int count = 0;         // 동전 개수

        while (n >= 0) {
            if (n % 5 == 0) {          // 5원으로 나누어 떨어지면
                count += n / 5;
                System.out.println(count);
                return;
            }
            n -= 2;    // 5로 나눌 수 없으면 2원 동전 하나 사용
            count++;
        }

        // 반복문 끝났다는 건 거슬러 줄 수 없다는 뜻
        System.out.println(-1);
    }
}
