import java.util.HashSet;

 class Solution {
        public int solution(int[] nums) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                hashSet.add(nums[i]);
                if(hashSet.size()==nums.length/2){
                    break;
                }
            }

            return hashSet.size();
        }
    }