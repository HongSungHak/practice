import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(i -> Math.sqrt(i) == (int) Math.sqrt(i) ? -i : i)
                .sum();
    }
}