import java.util.ArrayDeque;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        ArrayDeque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < cities.length; i++) {
            String str = cities[i].toUpperCase();

            if (cacheSize == 0) {
                answer += 5; // 캐시 크기가 0인 경우 모든 요청마다 5를 추가
            } else {
                if (deque.contains(str)) {
                    answer++;
                    deque.remove(str); // 캐시에서 해당 항목을 제거
                } else {
                    if (deque.size() >= cacheSize) {
                        deque.poll(); // 캐시 크기를 초과하는 경우 가장 오래된 항목을 제거
                    }
                    answer += 5;
                }
                deque.add(str); // 현재 항목을 캐시에 추가
            }
        }

        return answer;
    }
}
