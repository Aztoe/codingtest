
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String t, String p) {
        List<Integer> list = new ArrayList<>();
           int count =0;
        for (int i = 0; i < t.length()-p.length()+1; i++) {
            String temp =  t.substring(i, i+p.length());
            long num = Long.parseLong(temp);
            long intP = Long.parseLong(p);
            if( num<=intP) {
                count++;
            }
        }
     

        
        return  count;
    }
}
