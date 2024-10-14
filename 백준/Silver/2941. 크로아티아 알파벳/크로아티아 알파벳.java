import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < words.length; i++) {
            if (input.contains(words[i])) input = input.replace(words[i], "0");
        }
        System.out.println(input.length());
        sc.close();
    }
}