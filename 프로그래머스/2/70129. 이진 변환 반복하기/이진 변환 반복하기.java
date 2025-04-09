class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];


        while (!s.equals("1")) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                } else {
                    sb.append(s.charAt(i));
                }
            }

            int num = sb.length();
            s = Integer.toBinaryString(num);
            answer[0]++;
        }

        return answer;
    }
}
