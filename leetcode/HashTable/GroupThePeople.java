class Solution {
    public List<List<Integer>> groupThePeople(int[] grp) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, List> map = new HashMap<>();
        for (int i = 0; i < grp.length; i++) {
            if (map.containsKey(grp[i])) {
                List<Integer> list1 = map.get(grp[i]);
                list1.add(i);
                map.put(grp[i], list1);
            } else {
                List<Integer> list1 = new ArrayList<>();
                list1.add(i);
                map.put(grp[i], list1);
            }
        }
        for (int x : map.keySet()) {
            List<Integer> p = new ArrayList<>();
            List<Integer> list2 = map.get(x);
            for (int i : list2) {
                p.add(i);
                if (p.size() == x) {
                    list.add(p);
                    p = new ArrayList<>();
                }
            }
        }
        return list;
    }
}
