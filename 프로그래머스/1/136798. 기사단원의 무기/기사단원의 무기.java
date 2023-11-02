
public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int result = getNumber(i);
            if (result > limit) {
                result = power;
            }
            answer += result;
        }
        return answer;
    }

    public int getNumber(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
                if(i==Math.sqrt(num)) count++;
                else if(num%i==0) {
                    count+=2;
                }
        }
        return count;

    }
}


