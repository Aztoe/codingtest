import java.util.Arrays;



    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[]  result =new int[commands.length];

            for (int i = 0; i < commands.length; i++) {
                int[] command = commands[i];
                int start = command[0] -1;
                int end = command[1] ;
                int k = command[2]-1;

                int[] arrays = Arrays.copyOfRange(array, start,end);
                Arrays.sort(arrays);

                result[i] = arrays[k];
            }
            
            return  result;
        }
        
    }



