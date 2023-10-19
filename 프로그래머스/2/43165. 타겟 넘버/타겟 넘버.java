class Solution {
public int solution(int[] numbers, int target) {
        return calculateWays(numbers, 0, 0, target);
    }

    private int calculateWays(int[] numbers, int index, int sum, int target) {
        if (index == numbers.length) {
            return (sum == target) ? 1 : 0;
        }

        int result = 0;
        result += calculateWays(numbers, index + 1, sum + numbers[index], target);
        result += calculateWays(numbers, index + 1, sum - numbers[index], target);

        return result;
    }
}