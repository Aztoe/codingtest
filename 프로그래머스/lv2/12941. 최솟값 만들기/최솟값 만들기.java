import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution
    {
        public int solution(int []A, int []B)
        {
            List<Integer> min = new ArrayList<>();
            List<Integer> max = new ArrayList<>();

            for (int a : A) {
                min.add(a);
            }
            for (int b : B) {
                max.add(b);
            }
           Collections.sort(min);
        Collections.sort(max);
        
        int answer = 0;
        for (int i = 0; i < min.size(); i++) {
            answer += min.get(i) * max.get(max.size() - 1 - i);
        }
        
        return answer;
    }
}