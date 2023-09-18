import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}