import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};
        int[] count = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (student1[i%5] == answers[i]) count[0]++;
            if (student2[i%8] == answers[i]) count[1]++;
            if (student3[i%10] == answers[i]) count[2]++;
        }
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> list = new ArrayList<>();
        if (max == count[0]) list.add(1);
        if (max == count[1]) list.add(2);
        if (max == count[2]) list.add(3);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}