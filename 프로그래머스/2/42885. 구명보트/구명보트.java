import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        //Arrays.stream(people).boxed().sorted().collect(Collections.toList()) 사용시 시간초과남
        List<Integer> list = new ArrayList<>();
        for (int i : people) list.add(i);
        Collections.sort(list);

        ArrayDeque<Integer> dq = new ArrayDeque<>(50505);
        for(int x : list) dq.add(x);

        int ans = 0;
        while(dq.isEmpty() == false) {
            int weight = dq.pollLast();
            if(dq.isEmpty() == false && weight + dq.peekFirst() <= limit) { dq.pollFirst(); }
            ans++;
        }

        return ans;
    }
}