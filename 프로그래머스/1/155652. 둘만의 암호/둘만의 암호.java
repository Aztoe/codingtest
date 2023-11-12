
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        List<Character> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
         char[] c1 = new char[s.length()];
        for (int i = 0; i < 26; i++) {
            list.add((char) (i+97));
        }

       for (Character c : skip.toCharArray()) {
           list.remove(c);
       }

       StringBuilder sb = new StringBuilder();
       for (Character ch : s.toCharArray()) {
           int idx = list.indexOf(ch);
           idx = (idx+index) % list.size();
           sb.append(list.get(idx));
       }
        return  sb.toString();
    }

}
