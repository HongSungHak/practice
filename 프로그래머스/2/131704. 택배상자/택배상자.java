import java.util.*;
class Solution {
    public int solution(int[] order) {
        int count = 0;
        int idx = 0;
        Deque<Integer> sub = new ArrayDeque<>();
        for (int i = 1; i <= order.length; i++) {
            if (i == order[idx]) {
                count++;
                idx++;
            } else {
                sub.addLast(i);
            }
            while (!sub.isEmpty() && idx < order.length && sub.peekLast() == order[idx]) {
                sub.removeLast();
                idx++;
                count++;
            }
        }
        return count;
    }
}