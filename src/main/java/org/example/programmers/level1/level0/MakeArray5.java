package org.example.programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MakeArray5 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5});
        Arrays.stream(result).forEach(System.out::println);
    }
    public static int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.partitioningBy(number -> number % 2 == 1, Collectors.counting()))
                .values().stream()
                .mapToInt(Long::intValue)
                .toArray();
    }
}
