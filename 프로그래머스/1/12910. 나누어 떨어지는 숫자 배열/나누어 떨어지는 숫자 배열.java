import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        if (IntStream.range(0, arr.length)
            .map(i -> arr[i])
            .sorted()
            .noneMatch(i -> i % divisor == 0))
            return new int[]{-1};
        return IntStream.range(0, arr.length)
            .map(i -> arr[i])
            .sorted()
            .filter(i -> i % divisor == 0)
            .toArray();
    }
}