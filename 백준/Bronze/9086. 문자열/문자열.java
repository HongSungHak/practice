import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        for (int i = 0; i < inputNum; i++) {
            String inputString = sc.next();
            System.out.print(inputString.charAt(0));
            System.out.println(inputString.charAt(inputString.length() - 1));
        }
    }
}