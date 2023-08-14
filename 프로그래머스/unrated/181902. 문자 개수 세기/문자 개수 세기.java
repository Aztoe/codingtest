
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] charArr = my_string.toCharArray();
        for (char c:
             charArr) {
            int idx = c <'a' ? c-65:c-71;
            answer[idx]++;
            
        }

        return answer;
    }
}