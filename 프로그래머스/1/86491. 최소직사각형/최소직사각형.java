import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE;
        
        for (int[] arr : sizes) {
            Arrays.sort(arr);
        }
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (max1 < sizes[i][0]) max1 = sizes[i][0];
                if (max2 < sizes[i][1]) max2 = sizes[i][1];
            }
        }
        return max1 * max2;
    }
}