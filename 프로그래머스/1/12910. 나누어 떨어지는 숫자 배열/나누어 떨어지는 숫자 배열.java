import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        return IntStream.range(0, arr.length).map(i -> arr[i]).noneMatch(i -> i % divisor == 0) ?
            new int[]{-1} : IntStream.range(0, arr.length)
           .map(i -> arr[i])
           .sorted()
           .filter(i -> i % divisor == 0)
           .toArray();
    }
}