import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors; 


class Solution {
    public String solution(String X, String Y) {
        char[] xChars = X.toCharArray();
        char[] yChars = Y.toCharArray();

        List<Character> commonCharacters = new ArrayList<>();

        int[] xCounts = new int[10];
        int[] yCounts = new int[10];

        // X의 각 숫자의 개수를 셉니다.
        for (char c : xChars) {
            xCounts[c - '0']++; // '0'의 아스키 코드 값을 빼서 인덱스로 사용
        }

        // Y의 각 숫자의 개수를 셉니다.
        for (char c : yChars) {
            yCounts[c - '0']++;
        }

        // 3. 공통으로 나타나는 숫자를 찾고, 그 개수만큼 List에 추가합니다.
        // 예를 들어 X에 '3'이 2개, Y에 '3'이 3개 있다면 공통으로 '3'이 2개 있는 것입니다.
        for (int i = 0; i < 10; i++) {
            int count = Math.min(xCounts[i], yCounts[i]); // 두 문자열에서 해당 숫자가 나타난 최소 횟수
            for (int k = 0; k < count; k++) {
                commonCharacters.add((char) (i + '0')); // 숫자를 다시 문자로 변환하여 추가
            }
        }

        // 4. 공통 문자가 없는 경우 "-1"을 반환합니다.
        if (commonCharacters.isEmpty()) {
            return "-1";
        }

        // 5. 모든 공통 문자가 '0'이고, 그 외 다른 숫자가 없는 경우 "0"을 반환합니다.
        // 예: X = "100", Y = "200" -> "00"이지만, 문제에 따라 "0"이 될 수 있습니다.
        // 이 로직은 문제의 정확한 요구사항에 따라 달라질 수 있습니다.
        // 모든 공통 문자가 '0'이고, 길이가 1보다 클 경우 "0"만 반환하는 일반적인 규칙을 따릅니다.
        if (commonCharacters.size() > 0 && commonCharacters.stream().allMatch(c -> c == '0')) {
            return "0";
        }

        // 6. List의 문자를 내림차순으로 정렬합니다. (가장 큰 수를 만들기 위함)
        // Stream의 sorted()는 기본적으로 오름차순이므로, Collections.reverseOrder()를 사용합니다.
        return commonCharacters.stream()
                               .sorted(Collections.reverseOrder()) // 내림차순 정렬
                               .map(String::valueOf) // Character를 String으로 변환
                               .collect(Collectors.joining()); // String들을 연결
    }
}