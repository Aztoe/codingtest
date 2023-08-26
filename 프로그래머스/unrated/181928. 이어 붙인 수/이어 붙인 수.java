class Solution {
    public int solution(int[] num_list) {
        StringBuilder evenStringBuilder = new StringBuilder();
        StringBuilder oddStringBuilder = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStringBuilder.append(num); // 짝수를 짝수 문자열에 추가
            } else {
                oddStringBuilder.append(num); // 홀수를 홀수 문자열에 추가
            }
        }

        // 순서대로 이어붙인 문자열을 정수로 변환하여 합산
        int evenSum = evenStringBuilder.length() == 0 ? 0 : Integer.parseInt(evenStringBuilder.toString());
        int oddSum = oddStringBuilder.length() == 0 ? 0 : Integer.parseInt(oddStringBuilder.toString());

        return evenSum + oddSum;
    }
}
