class Solution {
    public int solution(int n) {
        int count = 0;
        int sum = 0;
        int start = 1;

        for (int end = 1; end <= n; end++) {
            sum += end;

            while (sum > n) {
                sum -= start;
                start++;
            }

            if (sum == n) {
                count++;
            }
        }

        return count;
    }
}
