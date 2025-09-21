import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder("<");
        int N = Integer.parseInt(st.nextToken()); // 숫자 총 개수
        int M = Integer.parseInt(st.nextToken()); // 시작 배수
        int index = 1;
        Queue<Integer> queue = new ArrayDeque<>();

        //숫자를 채우고
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        //숫자가 없어 질때까자
        while (!queue.isEmpty()) {

            if (index != M) {
                index++;
                int arr = queue.poll();
                queue.add(arr);
            } else {
                int poll = queue.poll();
                index = 1;
                if (queue.size() >= 1) {
                    sb.append(poll).append(", ");
                } else {
                    sb.append(poll);
                }

            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}