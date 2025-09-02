import java.util.stream.IntStream;

class Solution {
    public int solution(int number, int limit, int power) {
        return IntStream.rangeClosed(1, number)
            .map(i -> {
                int divisorCount = countDivisors(i);
                return divisorCount > limit ? power : divisorCount;
            })
            .sum();
    }
    
    private int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i * i != num) {
                    count++;
                }
            }
        }
        return count;
    }
}