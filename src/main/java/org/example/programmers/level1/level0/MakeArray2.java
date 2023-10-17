package org.example.programmers.level0;

import java.util.*;
import java.util.stream.*;
public class MakeArray2 {
    public int[] solution(int l, int r) {
        List<Integer> filtered = IntStream.rangeClosed(l, r)
                .filter(num -> String.valueOf(num).chars().allMatch(ch -> ch == '0' || ch == '5'))
                .boxed()
                .collect(Collectors.toList());
        return filtered.isEmpty() ? new int[]{-1} : filtered.stream().mapToInt(Integer::intValue).toArray();
    }
}
