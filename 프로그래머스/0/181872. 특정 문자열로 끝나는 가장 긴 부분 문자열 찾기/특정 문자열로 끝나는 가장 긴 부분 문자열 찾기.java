class Solution {
    public String solution(String myString, String pat) {
        String result = "";
        if (pat.length() == 1) {
            for (int i = myString.length() - 1; i >= 0; i--) {
                if (myString.charAt(i) == pat.charAt(0)) {
                    result = myString.substring(0, i + 1);
                    break;
                }
            }
            return result;
        }
        for (int i = myString.length() - 1; i >= 0; i--) {
            if (myString.substring(i + 1 - pat.length(), i + 1).equals(pat)) {
                result = myString.substring(0, i + 1);
                break;
            }
        }
        return result;
    }
}