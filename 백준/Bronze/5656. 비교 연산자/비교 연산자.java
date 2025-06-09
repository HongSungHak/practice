import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class ComparisonCase {
    int left, right;
    String operator;

    ComparisonCase(int left, String operator, int right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    boolean evaluate() {
        switch (operator) {
            case ">": return left > right;
            case "<": return left < right;
            case ">=": return left >= right;
            case "<=": return left <= right;
            case "==": return left == right;
            case "!=": return left != right;
            default: throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}

class ComparatorEngine {
    private final List<ComparisonCase> cases = new ArrayList<>();

    void addCase(ComparisonCase comparison) {
        cases.add(comparison);
    }

    void printResults() {
        int caseNum = 1;
        for (ComparisonCase c : cases) {
            System.out.printf("Case %d: %s\n", caseNum++, c.evaluate() ? "true" : "false");
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ComparatorEngine engine = new ComparatorEngine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = br.readLine()).contains("E")) {
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            String op = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            engine.addCase(new ComparisonCase(a, op, b));
        }
        engine.printResults();
    }
}
