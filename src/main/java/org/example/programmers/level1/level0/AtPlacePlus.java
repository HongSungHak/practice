package org.example.programmers.level0;

import java.util.Arrays;

public class AtPlacePlus {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
