import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
                if (result.size() == k) break;
            }
        }

        while (result.size() < k) {
            result.add(-1);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
