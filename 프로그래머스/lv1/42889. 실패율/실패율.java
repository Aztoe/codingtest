import java.util.*;

class Solution {
public int[] solution(int N, int[] stages) {
        int[] result = new int[N];
        int[] playerCount = new int[N + 1];
        double[] failRate = new double[N];

        for (int stage : stages) {
            if (stage <= N) {
                playerCount[stage]++;
            }
        }

        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failRate[i - 1] = 0;
            } else {
                failRate[i - 1] = (double) playerCount[i] / totalPlayers;
                totalPlayers -= playerCount[i];
            }
        }

        // 정렬된 인덱스를 생성하고 실패율을 기준으로 정렬
        Integer[] sortedIndices = new Integer[N];
        for (int i = 0; i < N; i++) {
            sortedIndices[i] = i;
        }

        Arrays.sort(sortedIndices, (a, b) -> Double.compare(failRate[b], failRate[a]));

        // 정렬된 인덱스를 기반으로 결과 배열 구성
        for (int i = 0; i < N; i++) {
            result[i] = sortedIndices[i] + 1;
        }

        return result;
    }
}