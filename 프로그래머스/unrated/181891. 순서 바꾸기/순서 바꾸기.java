class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length];
        
        // n 번째 이후의 원소들을 결과 배열의 앞부분에 복사
        System.arraycopy(num_list, n, result, 0, num_list.length - n);
        
        // n 번째까지의 원소들을 결과 배열의 뒷부분에 복사
        System.arraycopy(num_list, 0, result, num_list.length - n, n);
        
        return result;
    }
}
