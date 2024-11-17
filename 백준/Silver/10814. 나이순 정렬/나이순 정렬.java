import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Customer {
         int age;
         String name;

        public Customer(final int age, final String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Customer[] customers = new Customer[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            customers[i] = new Customer(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(customers, Comparator.comparingInt(s -> s.age));
        for (int i = 0; i < N; i++) {
            sb.append(customers[i]).append("\n");
        }
        System.out.println(sb);
    }
}