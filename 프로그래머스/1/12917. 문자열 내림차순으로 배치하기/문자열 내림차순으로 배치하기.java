import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return s.chars()
                .mapToObj(c -> (char) c) 
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf) 
                .collect(Collectors.joining());
    }
}
