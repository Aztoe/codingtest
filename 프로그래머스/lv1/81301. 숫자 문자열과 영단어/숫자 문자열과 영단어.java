import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {

        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);


        for (char c : s.toCharArray()) {
          
            if (Character.isDigit(c)) {
                // 숫자인 경우, 바로 결과에 추가
                result.append(c);
            }else {

                sb.append(c);
                if (map.containsKey(sb.toString())) {
                    int number = map.get(sb.toString());
                    result.append(number);
                    sb.setLength(0);
                }
            }

        }
        return Integer.parseInt(result.toString());
    }
}