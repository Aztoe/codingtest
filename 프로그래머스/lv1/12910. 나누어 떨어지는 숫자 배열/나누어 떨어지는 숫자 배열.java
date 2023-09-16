
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
           if(arr[i]%divisor ==0) {
               list.add(arr[i]);
           }
        }
        if (list.isEmpty()) {
            return new int[]{-1}; // 나누어 떨어지는 값이 없으면 -1을 담은 배열 반환
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        Arrays.sort(result); // 결과를 오름차순으로 정렬
        return result;
    }
}