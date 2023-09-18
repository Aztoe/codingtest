class Solution {
    public int solution(int[] a, int[] b) {
        int dotProduct = 0;
        
        for (int i = 0; i < a.length; i++) {
            dotProduct += a[i] * b[i];
        }
        
        return dotProduct;
    }
}
