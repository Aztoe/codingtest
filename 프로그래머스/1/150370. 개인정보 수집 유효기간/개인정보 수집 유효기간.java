
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;

    public class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            List<Integer> list = new ArrayList<>();
            HashMap<String,Integer>  map = new HashMap<>();
            int totalDay = 0;
            for (int i = 0; i < today.length(); i++) {
                String[] date = today.split("\\.");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);

                totalDay = year*12*28 + month*28 + day;
            }

            for(int i=0; i<terms.length; i++) {
                String[] term = terms[i].split(" ");
                map.put(term[0], Integer.parseInt(term[1]));
            }

            for (int i = 0; i < privacies.length; i++) {
                String[] privacy = privacies[i].split(" ");
                    String[] date = privacy[0].split("\\.");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);

                int privacyDay = year*12*28 + month*28 + day;
                if(privacyDay  + (map.get(privacy[1])*28)<=totalDay) {
                    list.add(i+1);
                }
             }

            return list.stream().mapToInt(i->i).toArray();
        }
    }
