class Solution {
    public String solution(String s, String skip, int index) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        int moved = 0;
        while (moved < index) {
            c = (char)(c + 1);
            if (c > 'z') c = (char)(c - 26);
            if (skip.indexOf(c) == -1) {      
                moved++;
            }
        }
        sb.append(c);
    }
    return sb.toString();
}
}