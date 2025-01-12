class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        for (int layer = 0; layer < n / 2; layer++) {
            int startRow = layer, endRow = n - layer - 1;
            int startCol = layer, endCol = n - layer - 1;

            for (int col = startCol; col <= endCol; col++) {
                answer[startRow][col] = num++;
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                answer[row][endCol] = num++;
            }
            for (int col = endCol - 1; col >= startCol; col--) {
                answer[endRow][col] = num++;
            }
            for (int row = endRow - 1; row > startRow; row--) {
                answer[row][startCol] = num++;
            }
        }

        if (n % 2 == 1) {
            answer[n / 2][n / 2] = num;
        }

        return answer;
    }
}