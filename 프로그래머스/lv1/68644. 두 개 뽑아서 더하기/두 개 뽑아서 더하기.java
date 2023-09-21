
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int[] numbers) {
        int sum =0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j=i+1 ; j <numbers.length ; j++) {

                sum = numbers[i] +numbers[j];
                list.add(sum);
            }
            
        }
        return list.stream().distinct().sorted().mapToInt(i->i).toArray();
    }
}
