
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        Queue<String> q3 = new LinkedList<>();
        for (int i = 0; i < cards1.length; i++) {
            q1.add(cards1[i]);

        }

        for (int i = 0; i < cards2.length; i++) {
            q2.add(cards2[i]);
        }
        for (int i = 0; i < goal.length ; i++) {
            q3.add(goal[i]);
        }
       


          while ((!q3.isEmpty())) {
              String str =q3.poll();

              if(str.equals(q1.peek())) q1.poll();
              else if (str.equals(q2.peek())) { q2.poll();
                  
              }else return "No";
          }
        
          return "Yes";
    }


}
