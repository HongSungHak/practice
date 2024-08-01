class Solution {
    public int findTargetNumber(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }
        
        int add = findTargetNumber(numbers, target, index + 1, sum + numbers[index]);
        int subtract = findTargetNumber(numbers, target, index + 1, sum - numbers[index]);
        
        return add + subtract;
    }

    public int solution(int[] numbers, int target) {
        return findTargetNumber(numbers, target, 0, 0);
    }
}