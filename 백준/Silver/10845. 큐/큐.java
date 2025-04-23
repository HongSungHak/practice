import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
            String word = st.nextToken();

            switch (word) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    break;

                case "pop":
                    System.out.println(q.isEmpty() ? -1 : q.poll());
                    break;

                case "size":
                    System.out.println(q.size());
                    break;

                case "empty":
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;

                case "front":
                    System.out.println(q.isEmpty() ? -1 : q.getFirst());
                    break;

                case "back":
                    System.out.println(q.isEmpty() ? -1 : q.getLast());
                    break;
            }
        }
    }
}
