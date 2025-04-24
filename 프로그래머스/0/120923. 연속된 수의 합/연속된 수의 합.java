class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middleNum = total / num;
        int subtracNum = total % num == 0 ? num / 2 : num / 2 - 1;
        for (int i = 0; i < num; i++) {
            answer[i] = middleNum - subtracNum + i;
        }
        return answer;
    }
}