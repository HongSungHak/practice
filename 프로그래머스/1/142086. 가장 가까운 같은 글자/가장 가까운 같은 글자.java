import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> lastSeenIndex = new HashMap<>();
        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (lastSeenIndex.containsKey(currentChar)) {
                result[i] = i - lastSeenIndex.get(currentChar);
            } else {
                result[i] = -1;
            }

            lastSeenIndex.put(currentChar, i);
        }

        return result;
    }
}
