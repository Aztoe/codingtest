import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String ans = String.valueOf(n);
        for (int i = 0; i < ans.length(); i++) {
            char c = ans.charAt(i);
            int num =Character.getNumericValue(c);
            answer += num;
        }

        return answer;
    }
}