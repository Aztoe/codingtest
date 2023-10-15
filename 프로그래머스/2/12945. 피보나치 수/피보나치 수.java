class Solution {
    public int solution(int n) {
        int[] list = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) list[i] = 0;
            else if (i == 1) list[i] = 1;
            else {
                int result = list[i - 1] + list[i - 2];
                list[i] = result % 1234567;
            }
        }
        return list[n];
    }
}
