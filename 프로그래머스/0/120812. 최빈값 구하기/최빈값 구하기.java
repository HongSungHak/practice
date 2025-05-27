import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        // 숫자별 등장 횟수를 Map으로 계산
        Map<Integer, Long> freqMap = Arrays.stream(array)
            .boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // 최댓값 (최빈 등장 횟수)
        long max = freqMap.values().stream()
            .mapToLong(Long::longValue)
            .max()
            .orElse(0);

        // 최빈값에 해당하는 key(숫자)만 필터링
        List<Integer> modes = freqMap.entrySet().stream()
            .filter(entry -> entry.getValue() == max)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        // 최빈값이 여러 개면 -1, 하나면 그 숫자 반환
        return modes.size() > 1 ? -1 : modes.get(0);
    }
}
