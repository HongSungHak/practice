import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int[] arr = new int[targets.length];

        for (int i = 0; i < keymap.length; i++) {
            char[] c = keymap[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                int value = j + 1;
                map.put(c[j], Math.min(value, map.getOrDefault(c[j], Integer.MAX_VALUE)));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            char[] c = targets[i].toCharArray();
            int sum = 0;

            for (char a : c) {
                if (!map.containsKey(a)) {
                    sum = -1;
                    break;
                }
                sum += map.get(a);
            }

            arr[i] = sum;
        }

        return arr;
    }
}