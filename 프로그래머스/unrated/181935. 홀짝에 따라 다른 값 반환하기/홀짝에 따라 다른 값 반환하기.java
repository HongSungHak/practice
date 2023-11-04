import java.util.stream.*;
class Solution {
    public int solution(int n) {
        if (n % 2 == 0) {
            return IntStream.iterate(2, i -> i <= n, i -> i += 2).map(i -> (int) Math.pow(i,2)).sum();
        }
        return IntStream.iterate(1, i -> i <= n, i -> i += 2).sum();
    }
}