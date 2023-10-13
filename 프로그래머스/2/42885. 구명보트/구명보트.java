import java.util.Arrays;

class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int first = 0;
        int last = people.length - 1;

        while (first <= last) {
            if (people[first] + people[last] <= limit) {
                first++;
                last--;
            } else {
                last--; // 보트에 한 명만 태우는 경우
            }
            answer++;
        }
        return answer;
    }
}
