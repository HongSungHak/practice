import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        String sortedSpell = sortString(String.join("", spell));  // 예: abc

        for (String word : dic) {
            if (word.length() != spell.length) continue;  // 길이 다르면 스킵
            if (sortedSpell.equals(sortString(word))) {
                return 1;
            }
        }

        return 2;
    }

    private String sortString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
