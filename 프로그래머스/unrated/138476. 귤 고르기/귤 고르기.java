import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((o1, o2) -> map.get(o2) - map.get(o1));

        int num = 0;
        int size = keys.size(); // keys 리스트의 크기 저장

        // k가 양수일 때만 처리
        while (num < size && k > 0) {
            k -= map.get(keys.get(num));
            num++;
            answer++;
        }

        return answer;
    }
}
