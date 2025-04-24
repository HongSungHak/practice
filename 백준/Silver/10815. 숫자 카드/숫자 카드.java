import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> frequencyMap = readFrequencyMap(sc);
        printQueryResults(sc, frequencyMap);

        sc.close();
    }

    private static Map<Integer, Integer> readFrequencyMap(Scanner sc) {
        int inputCount = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inputCount; i++) {
            int number = sc.nextInt();
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        return map;
    }

    private static void printQueryResults(Scanner sc, Map<Integer, Integer> map) {
        int queryCount = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < queryCount; i++) {
            int number = sc.nextInt();
            sb.append(map.getOrDefault(number, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
