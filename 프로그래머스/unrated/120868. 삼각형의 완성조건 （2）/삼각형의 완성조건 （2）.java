import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int count = 0;
        int max = Arrays.stream(sides).max().getAsInt();
        int min = Arrays.stream(sides).min().getAsInt();
        int tmp = max + min;
        int i = max + 1;
        while (min + max > i) {
            i++;
            count++;
        }
        while (tmp > max) {
            max++;
            count++;
        }
        return count;
    }
}