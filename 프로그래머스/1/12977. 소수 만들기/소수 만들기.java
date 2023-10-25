class Solution {
    public int solution(int[] nums) {
        int count = 0;
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                   count = 0;
                   int sum = nums[i] + nums[j] + nums[k];
                    for (int z = 1; z <= sum; z++) {
                        if (sum % z == 0) count++;                        
                    }
                    if (count == 2) answer++;
                }
            }
        }
        return answer;
    }
}