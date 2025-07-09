import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            int findNum = list.stream()
                    .filter(i -> i != null && i != 0)
                    .sorted(Comparator.reverseOrder())
                    .skip(2)
                    .findFirst()
                    .orElseGet(() -> 0);
            System.out.println(findNum);
            list.clear();
        }

    }
}