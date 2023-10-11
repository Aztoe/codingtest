class Solution {
    public int solution(int n) {
        int count = 0;

        for (int start = 1; start <= n; start++) {
            int sum = 0;
            for (int i = start; i <= n; i++) {
                sum += i;
                if (sum > n) {
                    break;
                } else if (sum == n) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
