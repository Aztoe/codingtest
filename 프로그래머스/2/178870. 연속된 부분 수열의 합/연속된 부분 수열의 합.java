public class Solution {

    public static int[] solution(int[] sequence, int k) {
        int[] result = new int[2];
        int start = 0;
        int end = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (end < sequence.length) {
            sum += sequence[end];

            while (sum > k) {
                sum -= sequence[start];
                start++;
            }

            if (sum == k) {
                int currentLength = end - start + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                    result[0] = start;
                    result[1] = end;
                }

                end++;
            } else {
                end++;
            }
        }

        return result;
    }

    
}
