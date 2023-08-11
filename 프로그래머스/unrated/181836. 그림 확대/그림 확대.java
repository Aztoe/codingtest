
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answerList = new ArrayList<>();
        for (String str : picture) {
            StringBuilder sb = new StringBuilder();
            for (char pixel : str.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    sb.append(pixel);
                }
            }
            // k배 확장한 줄을 answerList에 추가합니다.
            for (int i = 0; i < k; i++) {
                answerList.add(sb.toString());
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);

        return answer;
    }
}
