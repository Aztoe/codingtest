import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        
        for (int num : numbers) {
            numberSet.add(num);
        }
        
        int sum = 0;
        
        for (int i = 0; i <= 9; i++) {
            if (!numberSet.contains(i)) {
                sum += i;
            }
        }
        
        return sum;
    }
}