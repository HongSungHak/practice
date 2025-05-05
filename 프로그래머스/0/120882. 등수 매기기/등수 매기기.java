import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] total = new int[n];
        Integer[] rankTarget = new Integer[n];

        for (int i = 0; i < n; i++) {
            total[i] = score[i][0] + score[i][1];
            rankTarget[i] = total[i];
        }

        Arrays.sort(rankTarget, Collections.reverseOrder());

        int[] answer = new int[n];
        Map<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (!rankMap.containsKey(rankTarget[i])) {
                rankMap.put(rankTarget[i], rank);
            }
            rank++;
        }

        for (int i = 0; i < n; i++) {
            answer[i] = rankMap.get(total[i]);
        }

        return answer;
    }
}
