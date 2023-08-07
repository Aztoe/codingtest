import java.util.ArrayList;
import java.util.List;


class Solution {
        public int[] solution(String[] intStrs, int k, int s, int l) {
            List<Integer> list = new ArrayList<>();
            for(String str : intStrs) {
                int num = Integer.parseInt(str.substring(s, +s+l));
                if(num> k ){
                    list.add(num);
                }
            }
            return list.stream().mapToInt(i ->i).toArray();
        }
    }