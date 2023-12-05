import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i  = 0; i < 9; i++) {
            list.add(sc.nextInt());
        }
        int maxNumber = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        int index = list.indexOf(maxNumber);
        System.out.println(maxNumber + "\n" + (index + 1));
    }
}