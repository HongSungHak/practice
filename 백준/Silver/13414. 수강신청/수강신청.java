import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");

        int K = Integer.parseInt(firstLine[0]);
        int L = Integer.parseInt(firstLine[1]);

        LinkedHashSet<String> registrationOrder = new LinkedHashSet<>();

        for (int i = 0; i < L; i++) {
            String studentId = br.readLine();
            registrationOrder.remove(studentId);
            registrationOrder.add(studentId);
        }

        Iterator<String> iterator = registrationOrder.iterator();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (iterator.hasNext() && count < K) {
            sb.append(iterator.next()).append("\n");
            count++;
        }

        System.out.print(sb);
        br.close();
    }
}