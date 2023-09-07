import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            // 배열의 길이가 1 이하인 경우 빈 배열 또는 [-1]을 반환
            return new int[] {-1};
        }
        
        // 배열을 복사하여 정렬
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        
        // 가장 작은 수를 찾음
        int min = sortedArr[0];
        
        // 가장 작은 수를 제외한 나머지 원소를 새 배열에 복사
        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int num : arr) {
            if (num != min) {
                result[index] = num;
                index++;
            }
        }
        
        return result;
    }
}
