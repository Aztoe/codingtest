import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public long solution(long n) {
        // 각 자릿수를 저장할 리스트
        ArrayList<Integer> digits = new ArrayList<>();

        // 숫자를 각 자릿수로 분리하여 리스트에 저장
        while (n > 0) {
            digits.add((int)(n % 10));
            n /= 10;
        }

        // 각 자릿수를 큰 순서대로 정렬
        Collections.sort(digits, Collections.reverseOrder());

        // 새로운 정수를 만들기 위해 자릿수를 조합
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        // BigInteger로 변환하여 반환
        BigInteger result = new BigInteger(sb.toString());

        // long 형태로 변환하여 반환
        return result.longValue();
    }
}
