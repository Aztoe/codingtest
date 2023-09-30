import java.util.*;

 class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            int result =0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int s : scoville) {
                pq.add(s);
            }


            while (pq.peek() < K) {
            if (pq.size() < 2) {
                return -1;
            }
                 int a = pq.poll();
            int b = pq.poll();
            int mixed = a + (b * 2);

            pq.add(mixed);

            answer++;

            }

                return answer;
        }
    }