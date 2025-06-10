import java.util.*;

class Solution {
    Map<String, Integer> combinationMap = new HashMap<>();
    int maxCount;

    public List<String> solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>();

        for (int c : course) {
            combinationMap.clear();
            maxCount = 0;

            for (String order : orders) {
                char[] chars = order.toCharArray();
                Arrays.sort(chars);
                makeCombinations("", chars, 0, c);
            }

            for (Map.Entry<String, Integer> entry : combinationMap.entrySet()) {
                if (entry.getValue() >= 2 && entry.getValue() == maxCount) {
                    answerList.add(entry.getKey());
                }
            }
        }

        Collections.sort(answerList);
        return answerList;
    }

    private void makeCombinations(String current, char[] order, int index, int targetLength) {
        if (current.length() == targetLength) {
            combinationMap.put(current, combinationMap.getOrDefault(current, 0) + 1);
            maxCount = Math.max(maxCount, combinationMap.get(current));
            return;
        }

        for (int i = index; i < order.length; i++) {
            makeCombinations(current + order[i], order, i + 1, targetLength);
        }
    }
}
