import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string, int[] indices) {
        String[] words = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            words[indices[i]] = "";
        }
        return Arrays.stream(words).collect(Collectors.joining());
    }
}