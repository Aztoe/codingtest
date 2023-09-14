public class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            answer[str.length() - 1 - i] = Character.getNumericValue(c);
        }

        return answer;
    }
}