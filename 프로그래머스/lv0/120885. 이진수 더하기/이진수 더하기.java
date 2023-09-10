class Solution {
    public String solution(String bin1, String bin2) {
      StringBuilder res = new StringBuilder();
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += bin1.charAt(i--) - '0';
            if(j >= 0) sum += bin2.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}