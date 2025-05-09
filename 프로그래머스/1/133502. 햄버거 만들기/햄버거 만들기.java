class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int idx = 0;
        int answer = 0;

        for (int i : ingredient) {
            stack[idx++] = i;

            // 마지막 4개가 1,2,3,1이면 햄버거 완성
            if (idx >= 4 &&
                stack[idx - 4] == 1 &&
                stack[idx - 3] == 2 &&
                stack[idx - 2] == 3 &&
                stack[idx - 1] == 1) {
                
                idx -= 4;  // 햄버거 재료 제거
                answer++;
            }
        }

        return answer;
    }
}
