import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        for(int i : list) {
        	k -= map.get(i);
        	answer++;
        	if(k <= 0) return answer;
        }
        return answer;
    }
}