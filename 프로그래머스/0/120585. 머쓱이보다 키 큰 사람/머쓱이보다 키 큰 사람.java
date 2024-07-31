import java.util.stream.IntStream;

class Solution {
    public int solution(int[] array, int height) {
        return (int) IntStream.range(0, array.length).map(i -> array[i]).filter(i -> i > height).count();
    }
}