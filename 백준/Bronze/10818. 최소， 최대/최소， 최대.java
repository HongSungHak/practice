import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int a = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        int b = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(a +" "+b);
    }
}