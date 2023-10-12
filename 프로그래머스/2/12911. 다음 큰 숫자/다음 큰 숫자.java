public class Solution {
    public int solution(int n) {
        int setBits = toBinary(n);

        while (true) {
            n++;
            if (toBinary(n) == setBits) {
                return n;
            }
        }
    }

    private int toBinary(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }
        return count;
    }
}
