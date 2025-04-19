import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = n; row >= 1; row--) {
            String spaces = " ".repeat(n - row);
            String stars = "*".repeat(row);
            System.out.println(spaces + stars);
        }

        sc.close();
    }
}