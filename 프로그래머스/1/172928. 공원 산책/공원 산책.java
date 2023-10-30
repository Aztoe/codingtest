
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


   
    class Solution {

        static int nX;
        static int nY;
        List<Integer> list = new ArrayList<>();
        public int[] solution(String[] park, String[] routes) {

            Map<String, List<Integer>> map = new HashMap<>();

            map.put("N",List.of(-1,0));
            map.put("E",List.of(0,1));
            map.put("S",List.of(1,0));
            map.put("W",List.of(0,-1));

            String[][] parkArr = new String[park.length][park[0].length()];
            nX =0;
            nY = 0;
            for (int i = 0; i < park.length; i++) {
                String[] temp = park[i].split("");
                for (int j = 0; j < temp.length; j++) {
                    parkArr[i][j]= temp[j];
                    if(temp[j].equals("S")) {
                        nX = i;
                        nY = j;
                    }
                }

            }

            for (int i = 0; i < routes.length; i++) {
                String[] temp = routes[i].split(" ");
                List<Integer> direction = map.get(temp[0]);
                move(parkArr,nX,nY,direction,Integer.parseInt(temp[1]));
            }
            int[] answer = new int[2];
            answer[0] = nX;
            answer[1] = nY;
            return  answer;

        }

        public void move(String[][] parkArr, int x, int y, List<Integer> direction, int cnt) {
            if(cnt==0) {
                nX=x;
                nY=y;
                return;
            }
            int  nextX = x+direction.get(0);
            int nextY = y+direction.get(1);

            if(nextX>=0&&nextX< parkArr.length &&nextY>=0 &&nextY<parkArr[0].length) {
                if(!parkArr[nextX][nextY].equals("X")) {
                    move(parkArr,nextX,nextY,direction,cnt-1);
                }
            }
        }
    }

