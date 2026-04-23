import java.util.*;
class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i : topping) map2.put(i, map2.getOrDefault(i , 0) + 1);
        int answer = 0;

        for (int i = 0; i < topping.length; i++) {
            int key = topping[i];
            map1.put(key, map1.getOrDefault(key, 0) + 1);
            map2.put(key, map2.getOrDefault(key, 0) - 1);
            if (map2.get(key) == 0) map2.remove(key);
            if (map1.keySet().size() == map2.keySet().size()) answer++;
        }
        return answer;
    }
}