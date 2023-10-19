import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return IntStream.range(0, arr.length).map(i -> arr[i]).filter(i -> i != min).toArray();
    }
}