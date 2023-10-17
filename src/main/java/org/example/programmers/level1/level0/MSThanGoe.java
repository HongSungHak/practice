package org.example.programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MSThanGoe {
    public static void main(String[] args) {
        MSThanGoe msThanGoe = new MSThanGoe();
        int result1 = msThanGoe.solution(new int[]{149, 180, 192, 170}, 167);
        int result2 = msThanGoe.solution2(new int[]{149, 180, 192, 170}, 167);
        System.out.println(result1);
        System.out.println(result2);
    }
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(tall -> tall > height).count();
    }
    public int solution2(int[] array, int height) {
        return (int) IntStream.range(0, array.length).filter(tall -> tall > height).count();
    }
}
