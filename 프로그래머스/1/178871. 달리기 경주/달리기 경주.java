import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
         for (String c : callings) {
            int callIndex = map.get(c).intValue();
            int targetIndex = callIndex - 1;

            String targetPlayer = players[targetIndex];
            players[callIndex] = players[targetIndex];
            players[targetIndex] = c;

            map.put(c, targetIndex);
            map.put(targetPlayer, callIndex);
        }
        return players;
    }
}