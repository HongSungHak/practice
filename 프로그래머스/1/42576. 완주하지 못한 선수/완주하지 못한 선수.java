import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String complete : completion) {
            map.put(complete, map.get(complete) - 1);
        }

        return map.entrySet()
                  .stream()
                  .filter(entry -> entry.getValue() == 1)
                  .map(Map.Entry::getKey)
                  .findFirst()
                  .orElse("");
    }
}
