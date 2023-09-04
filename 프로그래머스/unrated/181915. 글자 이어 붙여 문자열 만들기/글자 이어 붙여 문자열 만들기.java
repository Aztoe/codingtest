class Solution {
 public static String solution(String my_string, int[] index_list) {
        StringBuilder result = new StringBuilder();         
        for (int index : index_list) {
            if (index >= 0 && index < my_string.length()) {
                result.append(my_string.charAt(index)); 
            }
        }
        
        return result.toString(); 
    }
}