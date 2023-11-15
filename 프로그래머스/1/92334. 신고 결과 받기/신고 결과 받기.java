
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, HashSet<String>> id = new HashMap<>();
        Map<String, Integer> reportNum = new HashMap<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(report));
        int[] answer = new int[id_list.length];
        for (String str : set) {
            String[] arr = str.split(" ");
            String reporter = arr[0]; //신고 한 사람
            String reported = arr[1];// 신고 받은 사람

            id.putIfAbsent(reporter, new HashSet<String>(){{
                add(reported);
            }});
            id.get(reporter).add(reported);
            reportNum.put(reported, reportNum.getOrDefault(reported, 0) + 1);
        }

        for (String reportKey : reportNum.keySet()) {
            int count = reportNum.get(reportKey);
            if (count >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (id.containsKey(id_list[i]) && id.get(id_list[i]).contains(reportKey))
                        answer[i]++;
                }
            }
        }

        return  answer;
    }
}
