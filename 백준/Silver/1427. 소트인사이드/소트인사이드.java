import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = Arrays.stream(br.readLine().split("")).sorted(Comparator.reverseOrder()).collect(joining());
        System.out.println(result);
    }
}