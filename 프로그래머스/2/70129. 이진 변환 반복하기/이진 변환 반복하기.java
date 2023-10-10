class Solution {
        public int[] solution(String s) {

            int count =0;
            int answer =0;
            int[] result = new int[2];
            while(!s.equals("1")) {
                int oncCount =0;
                for (char c : s.toCharArray()) {
                    if (c == '1') {
                        oncCount++;
                    }else{
                        count++;
                    }
                }
                s = Integer.toBinaryString(oncCount);
                answer++;
            }
            result[0] = answer;
            result[1] = count;

            return result;
        }
    }