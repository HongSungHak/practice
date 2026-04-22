import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        double diff = 0;
        double sum = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            String sub = str1.substring(i, i + 2);
            if (sub.matches("[a-z]{2}")) {
                map1.put(sub, map1.getOrDefault(sub, 0) + 1);
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            String sub = str2.substring(i, i + 2);
            if (sub.matches("[a-z]{2}")) {
                map2.put(sub, map2.getOrDefault(sub, 0) + 1);
            }
        }
        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        for (String key : keys) {
            int v1 = map1.getOrDefault(key, 0);
            int v2 = map2.getOrDefault(key, 0);

            diff += Math.min(v1, v2); 
            sum += Math.max(v1, v2);  
            
        }
        if (sum == 0) return 65536;
        return (int)((diff / sum) * 65536);
    }
}