class Solution {
        public int[] solution(int brown, int yellow) {

            int[] answer = new int[2];

            int sum = brown+yellow;
            int sqrt  = (int) Math.sqrt(sum);


            for (int a = sqrt; a <=sum ; a++) {
                if(sum%a==0) {
                    int b =sum/a;
                    if ((a - 2) * (b - 2) == yellow &&a>=b) {
                        answer[0] = a;
                        answer[1] = b;
                        break;
                    }

                }

            }

            return answer;
        }
    }