class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = (String.valueOf(a)+ String.valueOf(b));
        String ba = String.valueOf(2*a*b);
        int A = Integer.parseInt(ab);
        int B = Integer.parseInt(ba);

        if(A>B) {
            return A;
        } else if (A<B) {
            return  B;
        }else {
            return A;
        }
    }
}