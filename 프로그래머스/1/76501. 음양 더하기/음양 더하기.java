import java.util.stream.IntStream;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, signs.length)
                        .map(i ->signs[i] ? absolutes[i] : absolutes[i] * -1)
                        .sum();
    }
}