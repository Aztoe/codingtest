class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0; // cards1 배열의 인덱스
        int idx2 = 0; // cards2 배열의 인덱스
        
        // goal 배열 순회
        for (String Str : goal) {
            
            if (idx1 < cards1.length && Str.equals(cards1[idx1])) {
                idx1++; 
            } else if (idx2 < cards2.length && Str.equals(cards2[idx2])) {
                idx2++; 
            } else {
                return "No"; // 둘 다 포함하지 않는 경우
            }
        }
        
        return "Yes";
    }
}

