import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        while (count < arr.length) {
            if (stack.isEmpty() || stack.peek() < arr[count]) {
                stack.push(arr[count++]);
            } else {
                stack.pop();
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}