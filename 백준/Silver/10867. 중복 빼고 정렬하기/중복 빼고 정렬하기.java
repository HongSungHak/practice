import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력 개수 (실제로 사용 안 해도 무관)

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> hashSet = new HashSet<>();
        while (st.hasMoreTokens()) {
            hashSet.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> sortedList = new ArrayList<>(hashSet);
        Collections.sort(sortedList);

        StringBuilder sb = new StringBuilder();
        for (int num : sortedList) {
            sb.append(num).append(' ');
        }

        System.out.println(sb);
    }
}
