import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int minute = b + c;
        while (minute >= 60) {
            if (b + c >= 60) {
                a++;
                if (a >= 24) {
                    a -= 24;
                }
            }
            minute -= 60;
        }
        System.out.println(a + " " + minute);
    }
}