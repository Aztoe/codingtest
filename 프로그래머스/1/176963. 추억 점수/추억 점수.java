

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int j = 0; j < photo.length; j++) {
            int result = 0; 
            for (int i = 0; i < photo[j].length; i++) {
                if (map.containsKey(photo[j][i])) {
                    result += map.get(photo[j][i]);
                }
            }
            answer[j] = result; 
        }

        return answer;
    }
}
