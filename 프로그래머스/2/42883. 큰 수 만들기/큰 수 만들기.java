public class Solution {
    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        int sizeOfAnswer = number.length() - k;
        
        for (int i = 0; i < sizeOfAnswer; i++) {
            int insertValue = 0;
            for (int j = idx; j <= k + i; j++) {
                int temp = number.charAt(j) - '0';
                if (temp > insertValue) {
                    insertValue = temp;
                    idx = j + 1;
                }
            }

            answer.append(insertValue);
            if (answer.length() == sizeOfAnswer) {
                break;
            }
        }

        return answer.toString();
    }
}
