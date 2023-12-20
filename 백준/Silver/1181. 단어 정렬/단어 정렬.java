import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        List<String> collect = set.stream().sorted().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        Iterator<String> iterator = collect.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}