class Solution {
     public String solution(String code) {
        String answer = "";
        StringBuilder ref = new StringBuilder();
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            if(code.charAt(idx) =='1'){
                mode = 1-mode;
            } else if (idx%2 == mode) {
                answer += code.charAt(idx);
            }

        }



        return "".equals(answer) ? "EMPTY" : answer;


    }
}