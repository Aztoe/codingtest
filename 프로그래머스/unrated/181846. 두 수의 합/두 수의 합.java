import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // 문자열을 BigInteger로 변환
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        
        // BigInteger를 더한 후 문자열로 변환하여 반환
        BigInteger sum = numA.add(numB);
        String answer = sum.toString();
        
        return answer;
    }
}

