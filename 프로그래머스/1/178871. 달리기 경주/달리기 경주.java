
import java.util.HashMap;
import java.util.Map;


    class Solution {
        public String[] solution(String[] players, String[] callings) {
            String[] answer = {};
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < players.length; i++) {
                    map.put(players[i],i);

            }

            for (String player : callings) {
                int ranking = map.get(player);
                String front  = players[ranking-1];

                map.replace(front ,ranking);
                players[ranking] = front;

                map.replace(player,ranking-1);
                players[ranking-1] =player;
            }
            return players;
        }
    }



