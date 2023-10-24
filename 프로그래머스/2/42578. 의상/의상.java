import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String[][] clothes) {
                   Map<String,Integer> map = new HashMap<>();
            int answer = 1;
            for (String[] cloth :clothes ) {
               String type = cloth[1];
               map.put(type, map.getOrDefault(type,1)+1);
            }

            for (String str : map.keySet()){
                answer *= map.get(str);
            }


             return answer-1;
    }
}