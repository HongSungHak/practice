package org.example.programmers.level0;

import java.util.Arrays;

public class ReturnArray1 {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(i -> (i >= 50 && i % 2 == 0) ? i/2 : i < 50 && i % 2 != 0 ? i*2 : i)
                .toArray();
    }
}
