import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        int[] array = list.stream().sorted().mapToInt(i -> i).toArray();
        System.out.println(array[1]);
    }
}