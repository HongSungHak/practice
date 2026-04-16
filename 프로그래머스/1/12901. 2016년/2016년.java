import java.util.stream.IntStream;
class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = IntStream.range(0, a - 1).map(i -> months[i]).sum() + b;
        int index = (sum + 4) % 7;
        String answer = days[index];
        return answer;
    }
}