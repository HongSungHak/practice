import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int maxNum = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        long size = map.values()
                       .stream()
                       .filter(v -> v >= 1)
                       .count();

        int result = maxNum <=  (int) size ? maxNum : (int) size;
        
        return result;
    }
}