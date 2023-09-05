import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
            List<Integer> al = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i < n) {
                al.add(num_list[i]);
            } else {
                al.add(index++, num_list[i]);
            }
        }

        return al.stream().mapToInt(i -> i).toArray();
    }
}